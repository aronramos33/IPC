/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmlapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author aronr
 */
public class VentanaMenuAgricultorController implements Initializable {

    @FXML
    private MenuItem sobreNosotrosMenu;
    @FXML
    private Button cerrarSesionBoton;
    @FXML
    private Button añadirEntradasBoton;
    @FXML
    private Button visualizarEntradasBoton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cierreDeSesion(ActionEvent event) {
    }

    @FXML
    private void añadirEntradas(ActionEvent event) {
    }

    @FXML
    private void visualizarEntradas(ActionEvent event) {
    }
    
}
