package Controller;

import Main.Main;
import javafx.scene.control.Button;

public class AccesoController extends Main {
    public Button login;

    public void initialize() {
        login.setOnAction( actionEvent -> cargarNuevoFXML("/Resources/fxml/Main.fxml"));
        };
    }
