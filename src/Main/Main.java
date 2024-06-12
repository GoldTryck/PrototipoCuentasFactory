package Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import java.util.Objects;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects
                .requireNonNull(getClass()
                .getResource("/Resources/fxml/Main.fxml")));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects
                .requireNonNull(getClass()
                .getResource("/Resources/css/style.css"))
                .toExternalForm());
        stage.setScene(scene);
        stage.show();
    }
}
