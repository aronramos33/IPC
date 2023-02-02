/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Market;
import static model.Market.getSingletonMarket;
import model.MarketDAOException;

/**
 * FXML Controller class
 *
 * @author aronr
 */
public class VentanaRegistroClienteController implements Initializable {

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
    private TextField numeroTarjeta;
    @FXML
    private DatePicker fechaValidez;
    @FXML
    private PasswordField cvvTarjeta;
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
    @FXML
    private Label numeroTarjetaLabel;
    @FXML
    private Label cvvLabel;

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
    private void registrar(ActionEvent event) throws MarketDAOException, IOException {
        JavaFXMLApplication.clienteLog = Market.getSingletonMarket().registerCustomer(nombreUsuario.getText(), "emaill", "password", null, "street", 0, "door", "postalCode", 0, LocalDate.MIN, 0);
    }
    
}
