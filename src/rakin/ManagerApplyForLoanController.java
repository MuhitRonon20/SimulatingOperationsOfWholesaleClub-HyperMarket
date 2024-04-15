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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rakin
 */
public class ManagerApplyForLoanController implements Initializable {

    @FXML
    private ComboBox<?> LoanTypeComboBox;
    @FXML
    private ComboBox<?> LoanDurationComboBox;
    @FXML
    private TextField LoanDetailsTextField;
    @FXML
    private TextField LoanAmountTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SubmitLoanApplicationOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnAction(ActionEvent event) throws IOException 
        
    {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("ManagerDash.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    
}
