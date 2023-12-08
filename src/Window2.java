import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Window2 extends Stage {


public Window2() throws IOException, InterruptedException {
    Parent root = FXMLLoader.load(getClass().getResource("Window2.fxml"));
    setScene(new Scene(root));
    setTitle("Система Заправки Автомобилей");
    Image icon = new Image(new FileInputStream("bin\\kolonka.png"));
    getIcons().add(icon);
    show();

}

}