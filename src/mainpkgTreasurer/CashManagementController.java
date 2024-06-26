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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class CashManagementController implements Initializable {

    @FXML
    private Label beginingbalance;
    @FXML
    private Label income;
    @FXML
    private Label ecpense;
    @FXML
    private Label endbalance;
    @FXML
    private TextField beginingbalancetf;
    @FXML
    private TextField incometf;
    @FXML
    private TextField expensetf;
    @FXML
    private Label manageacc;
    @FXML
    private TableView<?> tvacc;
    @FXML
    private TableColumn<?, ?> tvclmaccname;
    @FXML
    private TableColumn<?, ?> tvclmbalance;
    @FXML
    private TableColumn<?, ?> tvclmstatus;
    @FXML
    private Label accname;
    @FXML
    private TextField accnametf;
    @FXML
    private Label balance;
    @FXML
    private TextField balancetf;
    @FXML
    private Label statustf;
    @FXML
    private Label date;
    @FXML
    private Label report;
    @FXML
    private ComboBox<?> reportcb;
    @FXML
    private Label endbalancetf;
    @FXML
    private ComboBox<?> datcb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void deletebuttonmouseclick(ActionEvent event) {
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
