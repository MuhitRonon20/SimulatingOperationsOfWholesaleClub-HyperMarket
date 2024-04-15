/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hyper_market;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class OrderandpaymentoptionController implements Initializable {

    @FXML
    private TableView<?> orderTV;
    @FXML
    private TableColumn<?, ?> productNameTC;
    @FXML
    private TableColumn<?, ?> unitPriceTC;
    @FXML
    private TableColumn<?, ?> quantityTC;
    @FXML
    private TableColumn<?, ?> vatTC;
    @FXML
    private TableColumn<?, ?> purchaseDateTC;
    @FXML
    private TableColumn<?, ?> ammountTC;
    @FXML
    private RadioButton CrediteCardRB;
    @FXML
    private RadioButton onlinePaymentRB;
    @FXML
    private RadioButton cODRB;
    @FXML
    private Button proceedButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void creditCardOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void onlinePaymentOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void cashOnDeleveryOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void proceedOnMouseClicked(ActionEvent event) {
    }
    
}
