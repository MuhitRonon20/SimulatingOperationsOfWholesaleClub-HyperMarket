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
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AdminTroubleshootFXMLController implements Initializable {

    @FXML
    private Label troubleTehnicalIssuesLabel;
    @FXML
    private Label describeTheIssuesLabel;
    @FXML
    private TextArea typeHereIssuesTextArea;
    @FXML
    private ListView<?> attachmentsListView;
    @FXML
    private Label attachmentsLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void uploadFileButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
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
