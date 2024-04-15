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
public class PlanningAndAnalysisController implements Initializable {

    @FXML
    private Label budgetctg;
    @FXML
    private Label budgetamount;
    @FXML
    private TextField budgetamounttf;
    @FXML
    private Label budget;
    @FXML
    private TextField budgettf;
    @FXML
    private Label status;
    @FXML
    private TextField statustf;
    @FXML
    private Label period;
    @FXML
    private TextField periodtf;
    @FXML
    private TableView<?> tvbudget;
    @FXML
    private TableColumn<?, ?> tvclmbudget;
    @FXML
    private TableColumn<?, ?> tvclmperiod;
    @FXML
    private TableColumn<?, ?> tvclmstatus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void savebuttononmouseclicck(ActionEvent event) {
    }

    @FXML
    private void generatereportbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void createbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void editbuttononmouseclick(ActionEvent event) {
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
