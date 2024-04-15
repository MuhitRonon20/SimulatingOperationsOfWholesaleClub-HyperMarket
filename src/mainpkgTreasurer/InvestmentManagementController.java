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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class InvestmentManagementController implements Initializable {

    @FXML
    private Label investment;
    @FXML
    private Label quantity;
    @FXML
    private Label PriceperUnit;
    @FXML
    private Label total;
    @FXML
    private Label totallbl;
    @FXML
    private TextField investmenttf;
    @FXML
    private TextField PriceperUnittf;
    @FXML
    private TableView<?> tvinvestment;
    @FXML
    private TableColumn<?, ?> tvcllminvestement;
    @FXML
    private TableColumn<?, ?> tvclmquantity;
    @FXML
    private TableColumn<?, ?> tvclmpricepayunit;
    @FXML
    private TableColumn<?, ?> tvclmtotalvalue;
    @FXML
    private TextArea breiftf;

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
    private void editbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void sendbuttonmouseclick(ActionEvent event) {
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
