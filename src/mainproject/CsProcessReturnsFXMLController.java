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

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CsProcessReturnsFXMLController implements Initializable {

    @FXML
    private Label processReturnLabel;
    @FXML
    private TableView<?> processReturnTableView;
    @FXML
    private TableColumn<?, ?> returnIdTC;
    @FXML
    private TableColumn<?, ?> orderIdTC;
    @FXML
    private TableColumn<?, ?> customerNameTC;
    @FXML
    private TableColumn<?, ?> returnReasonTC;
    @FXML
    private TableColumn<?, ?> statusTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void processReturnButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
