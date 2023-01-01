/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aronr
 */
public class VentanaRegistroAgricultorController implements Initializable {

    @FXML
    private Button cancelarBoton;
    @FXML
    private Button registrarBoton;
    @FXML
    private TextField nombreUsuario;
    @FXML
    private TextField correoElectronico;
    @FXML
    private PasswordField password;
    @FXML
    private TextField numeroCalle;
    @FXML
    private TextField codigoPostal;
    @FXML
    private TextField telefono;
    @FXML
    private Label nombreUsuarioLabel;
    @FXML
    private Label correoElectronicoLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label numeroCalleLabel;
    @FXML
    private Label codigoPostalLabel;
    @FXML
    private Label telefonoLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        BooleanProperty hasUpperCase = new SimpleBooleanProperty(false);
        BooleanProperty hasLowerCase = new SimpleBooleanProperty(false);
        BooleanProperty hasSpecialChar = new SimpleBooleanProperty(false);

        password.textProperty().addListener((observable, oldValue, newValue) -> {
        // Comprobamos si la cadena tiene al menos una mayúscula
        hasUpperCase.set(newValue.chars().anyMatch(Character::isUpperCase));
        // Comprobamos si la cadena tiene al menos una minúscula
        hasLowerCase.set(newValue.chars().anyMatch(Character::isLowerCase));
        // Comprobamos si la cadena tiene al menos un caracter especial
        hasSpecialChar.set(newValue.matches(".*[^a-zA-Z0-9 ].+"));
    });
    }    

    @FXML
    private void cancelar(ActionEvent event) {
        ((Stage) password.getScene().getWindow()).close();
    }

    @FXML
    private void registrar(ActionEvent event) {
    }
    
}
