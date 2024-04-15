/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkgHrHead;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class MeetingWithEmployeesController implements Initializable {

    @FXML
    private Label meetingdatelbl;
    @FXML
    private Label meetingtimelbl;
    @FXML
    private Label emplylbl;
    @FXML
    private ComboBox<?> emplycb;
    @FXML
    private Label meetinglbl;
    @FXML
    private ComboBox<?> meetingcb;
    @FXML
    private ComboBox<?> meetingtimecb;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendmeetingbuttononmouseclick(ActionEvent event) {
    }
    
}
