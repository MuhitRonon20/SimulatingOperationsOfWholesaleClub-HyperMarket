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
public class DebtManagementController implements Initializable {

    @FXML
    private TableView<?> debtsTable;
    @FXML
    private Label currentdebt;
    @FXML
    private TableColumn<?, ?> tvloanname;
    @FXML
    private TableColumn<?, ?> tvprincipleacc;
    @FXML
    private TableColumn<?, ?> tvdpaidamount;
    @FXML
    private TableColumn<?, ?> tvduedate;
    @FXML
    private TableColumn<?, ?> tvdebtamount;
    @FXML
    private Label loanname;
    @FXML
    private Label principleacc;
    @FXML
    private Label paidamount;
    @FXML
    private Label debtamount;
    @FXML
    private Label debtamountlbl;
    @FXML
    private TextField principleacctf;
    @FXML
    private TextField paidamounttf;
    @FXML
    private Label loannametf;
    @FXML
    private Label debtacc;
    @FXML
    private Label schedule;
    @FXML
    private Label amount;
    @FXML
    private TextField amounttf;
    @FXML
    private ComboBox<?> schedulecb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirmbuttononmouseclick(ActionEvent event) {
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
