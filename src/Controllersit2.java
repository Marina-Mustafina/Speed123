import java.io.IOException;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controllersit2{

    @FXML
    private ProgressBar pb7;

    @FXML
    private Button button4;

    @FXML
    private TextArea ta01;

    @FXML
    private void initialize(){
        Controller_2.setSit();
        Controller_2.setGunWorkFalse();
    }

    @FXML
    private void onClick4(ActionEvent event) throws IOException, InterruptedException {

                Task<Void> task = new Task<Void>() {
                    @Override
                    protected Void call() throws Exception {
                        for (int i = 0; i < 100; i++) {
                            Thread.sleep(50);
                            updateProgress(i + 1, 100);
                            if (i==99)
                            pb7.setVisible(false);
                        }
                        button4.setVisible(false);
                        ta01.setText("Ошибка исправлена");
                        Controller_2.setSuccess();
                        Controller_2.setGunWorkTrue();
                        ta01.setStyle("-fx-control-inner-background: #CF0A57");
                        Thread.sleep(1000);
                        Controller.setExet2();
                        return null;
                    }
                };
                
                pb7.progressProperty().bind(task.progressProperty());
                new Thread(task).start();
                
            }
}