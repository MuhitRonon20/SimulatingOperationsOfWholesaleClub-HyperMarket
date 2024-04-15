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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label adminLabel;
    @FXML
    private Label meetingLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void userAccountsManageButton(ActionEvent event)
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminUserManageFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    

    @FXML
    private void systemSecurityButton(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminSystemSecurityFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }

 

    @FXML
    private void technicalSupportButton(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminTroubleshootFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    

    @FXML
    private void generateReportsButton(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminGenerateSystemReportsFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    

    @FXML
    private void systemUpgradesButton(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminManageSystemUpdatesFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    

    @FXML
    private void requestLeaveButton(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminTakeLeaveFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    

    @FXML
    private void meetingScheduleButton(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminMeetingScheduleFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    
    
    @FXML
    private void organizeAndDeliverMeetingButton(ActionEvent event) 
        throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminMeetingManagmentFXML.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }
    

    
    
}
