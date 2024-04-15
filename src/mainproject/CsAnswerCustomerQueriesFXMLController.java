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
public class CsAnswerCustomerQueriesFXMLController implements Initializable {

    @FXML
    private Label answerQuriesLabel;
    @FXML
    private TableView<?> answerCustomerQueriesTableView;
    @FXML
    private TableColumn<?, ?> qureyIdTC;
    @FXML
    private TableColumn<?, ?> customerNameTC;
    @FXML
    private TableColumn<?, ?> queryTC;
    @FXML
    private TableColumn<?, ?> statusTC;
    @FXML
    private Label responseLabel;
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
    private void backButtonONClick(ActionEvent event) {
    }
    
}
