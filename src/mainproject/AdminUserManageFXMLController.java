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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AdminUserManageFXMLController implements Initializable {

    @FXML
    private ListView<?> userListView;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField emailField;
    @FXML
    private Label userAccountsManagementLabel;
    @FXML
    private Label userNameLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label designationLabel;
    @FXML
    private ComboBox<?> designationComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createUserButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void editUserButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void disableUserButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void deleteUserButtonOnClick(ActionEvent event) {
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
    
    

