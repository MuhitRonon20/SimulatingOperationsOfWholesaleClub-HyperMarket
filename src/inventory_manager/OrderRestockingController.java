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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class OrderRestockingController implements Initializable {

    @FXML
    private ComboBox<?> productCB;
    @FXML
    private ComboBox<?> supplierCB;
    @FXML
    private TextField quantityTF;
    @FXML
    private DatePicker deliveryDP;
    @FXML
    private Button orderButton;
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
    private void supplierOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void quantityOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void orderOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void cancelOnMouseClicked(ActionEvent event) {
    }
    
}
