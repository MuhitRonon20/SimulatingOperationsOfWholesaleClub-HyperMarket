/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkgHrHead;

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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class PayrollController implements Initializable {

    @FXML
    private TextField totalGrossPayField;
    @FXML
    private TextField totalNetPayField;
    @FXML
    private TextField totalNetPayField1;
    @FXML
    private Label totalemplylbl;
    @FXML
    private Label totalpaylbl;
    @FXML
    private Label totaldeduction;
    @FXML
    private Button approvebuttononmouseclick;
    @FXML
    private TableView<?> tvpayroll;
    @FXML
    private TableColumn<?, ?> tvclmemlyname;
    @FXML
    private TableColumn<?, ?> tvclmgrosspay;
    @FXML
    private TableColumn<?, ?> tvclmdeducction;
    @FXML
    private Label feedbacklbbl;
    @FXML
    private TextArea feedbacktf;
    @FXML
    private ComboBox<?> datecb;
    @FXML
    private Label datelbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generatereportbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void sendbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void sybmitbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void BackButtononmouseclick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("HrHead.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }
    
}
