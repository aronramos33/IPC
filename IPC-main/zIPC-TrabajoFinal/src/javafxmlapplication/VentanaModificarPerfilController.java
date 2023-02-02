/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author loren
 */
public class VentanaModificarPerfilController implements Initializable {

    @FXML
    private TextField nombre;
    @FXML
    private TextField correo;
    @FXML
    private PasswordField contraseña;
    @FXML
    private Button cancelarBoton;
    @FXML
    private Button guardarBoton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancelar(ActionEvent event) {
        ((Stage) contraseña.getScene().getWindow()).close();
    }

    @FXML
    private void guardar(ActionEvent event) {
    }
    
}
