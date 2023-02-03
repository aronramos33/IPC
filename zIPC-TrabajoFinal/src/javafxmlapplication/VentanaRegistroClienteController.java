/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Market;
import static model.Market.getSingletonMarket;
import model.MarketDAOException;
import model.User;

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
    @FXML
    private TextField direccion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        boolean email = User.checkEmail(correoElectronico.getText());
        boolean nickname = User.checkNickName(nombreUsuario.getText());
        boolean contraseña = User.checkPassword(password.getText());
        
        //registrarBoton.setDisable(true);
        
        registrarBoton.disableProperty().addListener((a, b, c) -> {
            if (email && nickname && contraseña) {
                registrarBoton.setDisable(false);
            }else{
                registrarBoton.setDisable(true);
            }
        });
        
    }    

    @FXML
    private void cancelar(ActionEvent event) {
        ((Stage) password.getScene().getWindow()).close();
    }

    @FXML
    private void registrar(ActionEvent event) throws MarketDAOException, IOException {
        Market.getSingletonMarket().registerCustomer(nombreUsuario.getText(), correoElectronico.getText(), password.getText(), null, direccion.getText(), 0, "door", codigoPostal.getText(), 0, LocalDate.MIN, 0);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Bienvenido!");
        alert.setHeaderText("Registro Finalizado");
        alert.setContentText("Su nombre de usuario es: " + nombreUsuario.getText());

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            FXMLLoader miCargador = new FXMLLoader(getClass().getResource("VentanaMenuCliente.fxml"));
            Parent root = miCargador.load();

            Scene scene = new Scene(root, 800, 450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Cliente");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
        }
        ((Stage) password.getScene().getWindow()).close();
    }
    
}
