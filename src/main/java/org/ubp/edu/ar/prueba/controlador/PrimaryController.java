package org.ubp.edu.ar.prueba.controlador;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import org.ubp.edu.ar.prueba.App;

public class PrimaryController {

    @FXML
    private Button btnHola;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void holaMundo() throws IOException {
        App.setRoot("tercero");
    }
}
