/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class LogininterfaceController implements Initializable {

   
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private ComboBox<String> userCB;
    @FXML
    private Button loginButton;
    @FXML
    private Button registerButton;
    @FXML
    private Label loginMessageLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){ 
        
        // Create an array of items
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        // Create a ComboBox and add items to it
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll(items);

    }    

    @FXML
    private void usernameOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void passwordOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void userOnMouseClicked(ActionEvent event) {
   
    }

    @FXML
    private void loginOnMouseClicked(ActionEvent event) {
        loginMessageLabel.setText("You try to login!");
        if (usernameTextField.getText().isEmpty()== false && passwordPasswordField.getText().isEmpty() == false){
                loginMessageLabel.setText("You try to login!");
        } else {
            loginMessageLabel.setText("Please enter your Username and password");
        }
    }

    @FXML
    private void registerOnMouseClicked(ActionEvent event) {
    }
    
}
