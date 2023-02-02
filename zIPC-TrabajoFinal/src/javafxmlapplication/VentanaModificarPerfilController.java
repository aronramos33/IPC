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
import javafx.scene.control.Alert;
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
    private Button cancelarBoton;
    @FXML
    private Button guardarBoton;
    @FXML
    private TextField nickName;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private TextField street;
    @FXML
    private TextField number;
    @FXML
    private TextField postalCode;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancelar(ActionEvent event) {
        ((Stage) password.getScene().getWindow()).close();
    }

    @FXML
    private void guardar(ActionEvent event) {
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
alert.setTitle("Información");
alert.setHeaderText("Nueva dirección guardada");
alert.setContentText("Las cestas se enviarán a la nueva dirección");
alert.showAndWait();

    }
    
}
