package Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application{
    public static Scene scene;
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects
                .requireNonNull(getClass()
                .getResource("/Resources/fxml/Acceso.fxml")));
        scene = new Scene(root);
        scene.getStylesheets().add(Objects
                .requireNonNull(getClass()
                .getResource("/Resources/css/style.css"))
                .toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    protected void cargarNuevoFXML(String rutaFXML) {
        try {
            Parent nuevoRoot = FXMLLoader.load(Objects
                    .requireNonNull(getClass()
                    .getResource(rutaFXML)));
            scene.setRoot(nuevoRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
