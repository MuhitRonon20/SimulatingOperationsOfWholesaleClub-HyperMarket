/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package rakin;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rakin
 */
public class ManagerDashController implements Initializable {

    @FXML
    private Button profileCheck;
    @FXML
    private Button inventoryReports;
    @FXML
    private Button ViewLoanButton;
    @FXML
    private Button financialManagementButton;
    @FXML
    private Button getSecutrityAlertsButton;
    @FXML
    private Button meetingButton;
    @FXML
    private Button feedbackButton;
    @FXML
    private Button checkPerformanceButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void profileCheckButtonOnAction(ActionEvent event) throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerProfile.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    @FXML
    private void inventoryReportsButtonOnAction(ActionEvent event) throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerinventoryReports.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    } @FXML
    private void ViewLoanButtonApplicationOnAction(ActionEvent event) throws IOException 
     {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerApplyForLoan.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    @FXML
    private void financialManagementButtonOnAction(ActionEvent event) throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerFinancialManagement.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    @FXML
    private void getSecutrityAlertsButtonOnAction(ActionEvent event) throws IOException 
       {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerGetSecurityAlert.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    @FXML
    private void meetingButtonOnAction(ActionEvent event) throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerCheckMeetingTime.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void FeedbackButtonOnAction(ActionEvent event) throws IOException 
     {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerProvideFeedbacks.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void checkPerformanceButtonOnAction(ActionEvent event) throws IOException 
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerCheckPerformance.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    
}
