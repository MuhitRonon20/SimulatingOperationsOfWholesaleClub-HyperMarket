/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CsOfferProductInformationFXMLController implements Initializable {

    @FXML
    private Label offerProductInformationLabel;
    @FXML
    private TableView<?> offerProductInformationTableView;
    @FXML
    private TableColumn<?, ?> productIdTC;
    @FXML
    private TableColumn<?, ?> productNameTC;
    @FXML
    private TableColumn<?, ?> decriptionTC;
    @FXML
    private TableColumn<?, ?> categoryTC;
    @FXML
    private TableColumn<?, ?> priceTC;
    @FXML
    private Label productInformationLabel;
    @FXML
    private TextArea enterProductInfoTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
