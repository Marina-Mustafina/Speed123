import java.io.FileInputStream;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Intelligence extends Stage {

public Intelligence() throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("Intelligence.fxml"));
    setScene(new Scene(root));
    setTitle("Система Заправки Автомобилей");
    Image icon = new Image(new FileInputStream("bin\\kolonka.png"));
    getIcons().add(icon);
    show();
    
}

}