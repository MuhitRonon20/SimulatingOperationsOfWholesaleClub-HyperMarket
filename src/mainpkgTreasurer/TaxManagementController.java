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
public class TaxManagementController implements Initializable {

    @FXML
    private Label taxdeadline;
    @FXML
    private TableView<?> tvtaxdeadline;
    @FXML
    private TableColumn<?, ?> tvtaxtyp;
    @FXML
    private TableColumn<?, ?> tvduedate;
    @FXML
    private TableColumn<?, ?> tvamountdue;
    @FXML
    private TableColumn<?, ?> tvpaymentstatus;
    @FXML
    private Label initiatetax;
    @FXML
    private Label selecttaxtyp;
    @FXML
    private ComboBox<?> selecttaxtypcb;
    @FXML
    private Label paymentamount;
    @FXML
    private Label selectreport;
    @FXML
    private Label reportperiod;
    @FXML
    private ComboBox<?> selectreportcb;
    @FXML
    private ComboBox<?> reportperiodcb;
    @FXML
    private TextField paymentamountt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void paunowbuttononmousclick(ActionEvent event) {
    }

    @FXML
    private void generatereportbuttononmoouseclick(ActionEvent event) {
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
