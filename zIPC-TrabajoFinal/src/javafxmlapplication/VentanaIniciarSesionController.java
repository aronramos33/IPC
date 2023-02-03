/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Market;
import model.User;

/**
 * FXML Controller class
 *
 * @author aronr
 */
public class VentanaIniciarSesionController implements Initializable {

    @FXML
    private Button cancelarBoton;
    @FXML
    private Button iniciarSesionBoton;
    @FXML
    private TextField nombreUsuario;
    @FXML
    private PasswordField password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancelar(ActionEvent event) throws IOException {
        ((Stage) iniciarSesionBoton.getScene().getWindow()).close();
    }

    @FXML
    private void iniciarSesion(ActionEvent event) throws IOException {
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("VentanaEleccionInicioDeSesion.fxml"));
        Parent root = miCargador.load();
        
        Scene scene = new Scene(root, 800, 450);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Inicio de Sesión");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

    }
    
}
