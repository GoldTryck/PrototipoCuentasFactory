package Main.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;


public class MainController {

    public MenuItem grupo;
    public MenuItem salir;
    public MenuItem abrir;
    public MenuItem ocultar;
    @FXML
    private AnchorPane content;

    @FXML
    private void initialize() {
        grupo.setOnAction(actionEvent -> {
            cargarContent("/Resources/fxml/CrearGrupo.fxml");
        });
        salir.setOnAction(actionEvent -> salir());
        abrir.setOnAction(actionEvent -> abrirSelectorDeArchivos());
        ocultar.setOnAction(actionEvent -> minimizar());
    }

    @FXML
    private void cargarContent(String url) {
        try {
            // Cargar CrearGrupo.fxml
            FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
            Parent root = loader.load();

            // Colocar el contenido en el AnchorPane content
            content.getChildren().setAll(root);

        } catch (IOException e) {
            e.printStackTrace();
            // Manejo de la excepción
        }
    }

    @FXML
    private void salir() {
        // Cierra la aplicación adecuadamente
        Stage stage = (Stage) content.getScene().getWindow();
        stage.close();
    }
    private void abrirSelectorDeArchivos() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar Archivo");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Archivos CSV", "*.csv")
        );

        File archivoSeleccionado = fileChooser.showOpenDialog(content.getScene().getWindow());

        if (archivoSeleccionado != null) {
            cargarContent("/Resources/fxml/CrearCuentas.fxml");
        }

    }
    private void minimizar() {
        Stage stage = (Stage) content.getScene().getWindow();
        stage.setIconified(true);
    }
}





