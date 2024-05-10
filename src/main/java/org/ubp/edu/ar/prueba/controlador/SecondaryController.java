package org.ubp.edu.ar.prueba.controlador;

import java.io.IOException;
import javafx.fxml.FXML;
import org.ubp.edu.ar.prueba.App;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}