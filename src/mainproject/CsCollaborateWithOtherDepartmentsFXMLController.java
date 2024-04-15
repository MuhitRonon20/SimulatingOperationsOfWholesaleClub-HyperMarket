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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CsCollaborateWithOtherDepartmentsFXMLController implements Initializable {

    @FXML
    private Label collaborateWithOtherDepartmentsLabel;
    @FXML
    private Label selectDepartmentLabel;
    @FXML
    private ComboBox<?> departmentTypeComboBox;
    @FXML
    private Label messageLabel;

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
