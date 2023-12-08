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

public class Controllersit{

    @FXML
    private ProgressBar pb1;

    @FXML
    private Button button3;

    @FXML
    private TextArea ta1;

    @FXML
    private void initialize(){
        Controller_2.setSit();
        
    }

    @FXML
    private void onClick(ActionEvent event) throws IOException, InterruptedException {

                Task<Void> task = new Task<Void>() {
                    @Override
                    protected Void call() throws Exception {
                        for (int i = 0; i < 100; i++) {
                            Thread.sleep(50);
                            updateProgress(i + 1, 100);
                            if (i==99)
                            pb1.setVisible(false);
                        }
                        button3.setVisible(false);
                        ta1.setText("Ошибка исправлена");
                        ta1.setStyle("-fx-control-inner-background: #CF0A57");
                        Thread.sleep(1000);
                        Controller_2.setSuccess();
                        Controller.setExet();
                        return null;
                    }
                };
                
                pb1.progressProperty().bind(task.progressProperty());
                new Thread(task).start();
                
            }
}