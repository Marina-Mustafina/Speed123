import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class OriginalWindow extends Application{
    
@Override
public void start(Stage primaryStage) throws Exception {
Parent root = FXMLLoader.load(getClass().getResource("OriginalWindow.fxml"));
primaryStage.setScene(new Scene(root));
primaryStage.setTitle("Система Заправки автомобилей   Мустафина Марина ЭАС-412С");
primaryStage.setResizable(false);
Image icon = new Image(new FileInputStream("bin\\kolonka.png"));
primaryStage.getIcons().add(icon);
primaryStage.show();
}
       
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
