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
public class CsCustomerFeedbackFXMLController implements Initializable {

    @FXML
    private Label customerFeedbackLabel;
    @FXML
    private TableView<?> customerFeedbackTableView;
    @FXML
    private TableColumn<?, ?> feedbackIdTC;
    @FXML
    private TableColumn<?, ?> customerNameTC;
    @FXML
    private TableColumn<?, ?> feedbackTC;
    @FXML
    private TableColumn<?, ?> ratingTC;
    @FXML
    private Label reponseLabel;
    @FXML
    private TextArea replyResponseTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void replyButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonClick(ActionEvent event) {
    }
    
}
