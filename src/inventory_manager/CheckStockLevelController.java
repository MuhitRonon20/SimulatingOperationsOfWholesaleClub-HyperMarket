/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package inventory_manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class CheckStockLevelController implements Initializable {

    @FXML
    private ComboBox<?> productComboBox;
    @FXML
    private Label outputLabel;
    @FXML
    private Button refreshButton;
    @FXML
    private Button closeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void productOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void refreshOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void closeOnMouseClicked(ActionEvent event) {
    }
    
}
