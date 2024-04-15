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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class VendorAndSupplierPaymentsController implements Initializable {

    @FXML
    private Label pendingvendor;
    @FXML
    private TableView<?> tvvendor;
    @FXML
    private TableColumn<?, ?> tvvendorname;
    @FXML
    private TableColumn<?, ?> tvduedate;
    @FXML
    private TableColumn<?, ?> tvamount;
    @FXML
    private TableColumn<?, ?> tvpayment;
    @FXML
    private Label intial;
    @FXML
    private Label selectthevendor;
    @FXML
    private ComboBox<?> selectvendorcb;
    @FXML
    private Label enterpayment;
    @FXML
    private TextField enterpaymentcb;
    @FXML
    private Label selectpayment;
    @FXML
    private ComboBox<?> selectpaymentcb;
    @FXML
    private Button paynowbuttononmouseclick;
    @FXML
    private Label selecttaxreport;
    @FXML
    private Label report;
    @FXML
    private ComboBox<?> selecttaxreportcb;
    @FXML
    private ComboBox<?> reportcb;
    @FXML
    private Label vendor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generatebuttononmouseeclick(ActionEvent event) {
    }
    
}
