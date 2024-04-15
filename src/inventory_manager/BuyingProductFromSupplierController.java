/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package inventory_manager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class BuyingProductFromSupplierController implements Initializable {

    @FXML
    private ComboBox<?> supplierCB;
    @FXML
    private ComboBox<?> productCB;
    @FXML
    private TextField quantityTF;
    @FXML
    private TextField unitPriceTF;
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
    private void supplierOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void productOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void saveOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void cancelOnMouseClicked(ActionEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("inventorymanagerdb.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }
    
}
