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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aronr
 */
public class VentanaEleccionInicioDeSesionController implements Initializable {

    @FXML
    private Button cancelarBoton;
    @FXML
    private Button clienteBoton;
    @FXML
    private Button agricultorBoton;
    @FXML
    private Button administrador;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancelar(ActionEvent event) {
        ((Stage) cancelarBoton.getScene().getWindow()).close();
    }

    @FXML
    private void cliente(ActionEvent event) throws IOException {
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("VentanaMenuCliente.fxml"));
        Parent root = miCargador.load();
        
        Scene scene = new Scene(root, 800, 450);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Cliente");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    @FXML
    private void agricultor(ActionEvent event) throws IOException {
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("VentanaMenuAgricultor.fxml"));
        Parent root = miCargador.load();
        
        Scene scene = new Scene(root, 800, 450);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Agricultor");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    @FXML
    private void administrador(ActionEvent event) throws IOException {
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("VentanaMenuAdmin.fxml"));
        Parent root = miCargador.load();
        
        Scene scene = new Scene(root, 800, 450);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Administrador");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }
    
}
