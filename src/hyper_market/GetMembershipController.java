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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class GetMembershipController implements Initializable {

    @FXML
    private ComboBox<?> membershipTypeCB;
    @FXML
    private Button joinButton;
    @FXML
    private Button cancelButton;
    @FXML
    private DatePicker membershipStartDP;
    @FXML
    private DatePicker membershipEndDP;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void membershipTypeOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void joinOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void cancelOnMouseClicked(ActionEvent event) {
    }
    
}
