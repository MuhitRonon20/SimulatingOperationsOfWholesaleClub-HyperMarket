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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class PreventingOverstockController implements Initializable {

    @FXML
    private Label outptutLabel;
    @FXML
    private ComboBox<?> productCB;
    @FXML
    private TextField recorderPointTF;
    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;

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
    private void saveOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void cancelOnMouseClicked(ActionEvent event) {
    }
    
}
