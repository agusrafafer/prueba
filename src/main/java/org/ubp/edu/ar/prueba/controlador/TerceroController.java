/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package org.ubp.edu.ar.prueba.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author agustin
 */
public class TerceroController extends Controlador implements Initializable {

    @FXML
    private TextField txtPrueba;

    @FXML
    private Button btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void mostrarNombre() {

        String nombre = this.txtPrueba.getText();
        if (!nombre.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION, "Info");
            alerta.setTitle("Hola: " + nombre);
            alerta.show();
        }
    }

}
