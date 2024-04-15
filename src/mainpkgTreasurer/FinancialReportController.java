/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkgTreasurer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class FinancialReportController implements Initializable {

    @FXML
    private Label reportperiod;
    @FXML
    private Label date;
    @FXML
    private Label writtentstmt;
    @FXML
    private TextArea writttenstmttf;
    @FXML
    private ComboBox<?> reportperiodcb;
    @FXML
    private ComboBox<?> datecb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void incomebuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void balancesheetbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void cashflowbuttononmousseclick(ActionEvent event) {
    }

    @FXML
    private void generatereportbuttononmouseclick(ActionEvent event) {
    }
    
}
