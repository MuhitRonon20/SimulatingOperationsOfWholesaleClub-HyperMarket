/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainproject;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AdminMeetingManagmentFXMLController implements Initializable {

    @FXML
    private Label meetingManagementLabel;
    @FXML
    private Label organizeMeetingLabel;
    @FXML
    private Label titleLabel;
    @FXML
    private Label organizerLabel;
    @FXML
    private TextField titleTextField;
    @FXML
    private TextField organizerTextField;
    @FXML
    private Label attendeesLabel;
    @FXML
    private TextArea enterAttendeesTextArea;
    @FXML
    private Label startDateLabel;
    @FXML
    private Label endDateLabel;
    @FXML
    private DatePicker startDatePicker;
    @FXML
    private DatePicker endDatePicker;
    @FXML
    private Label deliverMeetingLabel;
    @FXML
    private Label meetingIdLabel;
    @FXML
    private Label locationLabel;
    @FXML
    private TextField MeetingIdTextField;
    @FXML
    private TextField locationTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void startDatePickerOnClick(ActionEvent event) {
    }

    @FXML
    private void endDatePickerOnClick(ActionEvent event) {
    }

    @FXML
    private void organizerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void deliverButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminDashboardFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }
    
}
    
    

