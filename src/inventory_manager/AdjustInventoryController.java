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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

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

    @FXML
    private void backOnMouseclicked(ActionEvent event) throws IOException {
         {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("inventorymanagerdb.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }
    
}
        
    }
    

