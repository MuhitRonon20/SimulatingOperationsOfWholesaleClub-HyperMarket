/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkgTreasurer;

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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

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

    @FXML
    private void BackButtononmouseclick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Treasurer.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }
    
}
