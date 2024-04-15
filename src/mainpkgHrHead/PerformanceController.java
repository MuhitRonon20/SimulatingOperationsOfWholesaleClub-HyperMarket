/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkgHrHead;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class PerformanceController implements Initializable {

    @FXML
    private Label goallbl;
    @FXML
    private Label goaltf;
    @FXML
    private Label duedtaelbl;
    @FXML
    private Label duedatelbl;
    @FXML
    private TableView<?> tvperformance;
    @FXML
    private TableColumn<?, ?> tvclmname;
    @FXML
    private TableColumn<?, ?> tvcllmsatus;
    @FXML
    private Label emplylbl;
    @FXML
    private ComboBox<?> emplycb;
    @FXML
    private Label feedbk;
    @FXML
    private TextArea feedbktf;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Submitbuttonmouseclick(ActionEvent event) {
    }
    
}
