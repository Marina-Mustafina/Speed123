import java.io.FileInputStream;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Situation2{
    private static Stage situation;

public Situation2() throws IOException, InterruptedException {
    Parent root = FXMLLoader.load(getClass().getResource("Situation2.fxml"));
    situation = new Stage();
    situation.setScene(new Scene(root));
    situation.setResizable(false);
    situation.setTitle("Система Заправки Автомобилей");
    Image icon = new Image(new FileInputStream("bin\\kolonka.png"));
    situation.getIcons().add(icon);
}



public static void exitWin(){
    situation.close();
}



public void show() {
    situation.show();
}

}