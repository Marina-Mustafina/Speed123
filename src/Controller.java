import java.io.IOException;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    Window2 work;
    Situation sit;
    Situation2 sit2;

    protected static boolean iSituation=false;
    protected static boolean iSituation2=false;

    @FXML
    private void onClick(ActionEvent event) throws IOException, InterruptedException {
    work = new Window2();
    work.show();
    long startNanoTime = System.nanoTime();
    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long now) {
            double elapsedSeconds = (now - startNanoTime) / 1_000_000_000.0;
            if (elapsedSeconds>45) {
                try {
                    sit = new Situation();
                } catch (IOException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                sit.show();
                System.out.println("Электричество отключилось! Резервный аккумулятор активирован.");
                this.stop();
            }
        };
    };
    timer.start();
    AnimationTimer timer2 = new AnimationTimer() {
        @Override
        public void handle(long now) {
            double elapsedSeconds = (now - startNanoTime) / 1_000_000_000.0;
            if (elapsedSeconds>10) {
                try {
                    sit2 = new Situation2();
                } catch (IOException | InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                sit2.show();
                System.out.println("Поломка Заправочного Пистолета");
                this.stop();
            }
        };
    };
    timer2.start();
    AnimationTimer checker = new AnimationTimer() {
       @Override
       public void handle(long now){
        if (iSituation){
            sit.exitWin();
        }
        if (iSituation2){
            sit2.exitWin();
        }
        }
    };
    checker.start();
}

    @FXML
    private void onClick1(ActionEvent event) throws IOException, InterruptedException {
    Intelligence wr = new Intelligence();
    wr.show();
}

    public static void setExet(){
        iSituation=true;
    }

    public static void setExet2(){
        iSituation2=true;
    }

}