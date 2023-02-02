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
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aronr
 */
public class VentanaMenuClienteController implements Initializable {

    @FXML
    private MenuItem sobreNosotrosMenu;
    @FXML
    private Button modificarBoton;
    @FXML
    private Button cerrarSesionBoton;
    @FXML
    private Button reservaBoton;
    @FXML
    private Button anularBoton;
    @FXML
    private Button visualizarBoton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void modificar(ActionEvent event) throws IOException {
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("VentanaModificarPerfil.fxml"));
        Parent root = miCargador.load();
        
        Scene scene = new Scene(root, 800, 450);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Inicio de Sesión");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

    @FXML
    private void cierreDeSesion(ActionEvent event) {
    }

    @FXML
    private void reserva(ActionEvent event) {
    }

    @FXML
    private void anular(ActionEvent event) {
    }

    @FXML
    private void visualizar(ActionEvent event) {
    }
    
}
