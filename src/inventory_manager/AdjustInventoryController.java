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
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class AdjustInventoryController implements Initializable {

    @FXML
    private ComboBox<?> inventoryItemComboBox;
    @FXML
    private RadioButton addRadioButton;
    @FXML
    private RadioButton subtractRadioButton;
    @FXML
    private Button saveAdjustmentButton;
    @FXML
    private Button editAdjustmentButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inventoryItemOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void addOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void substractOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void saveAdjustmentOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void editAdjustmentOnMouseClicked(ActionEvent event) {
    }
    
}
