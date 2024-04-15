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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class AttendanceController implements Initializable {

    @FXML
    private Label emplylbl;
    @FXML
    private Label datelbl;
    @FXML
    private ComboBox<?> emplycb;
    @FXML
    private ComboBox<?> datecb;
    @FXML
    private TableView<?> TVempky;
    @FXML
    private TableColumn<?, ?> TVclmname;
    @FXML
    private TableColumn<?, ?> TVclmstatus;
    @FXML
    private TableView<?> TVLeave;
    @FXML
    private TableColumn<?, ?> duration;
    @FXML
    private TableColumn<?, ?> TVclmreason;
    @FXML
    private Label namelbl;
    @FXML
    private ComboBox<?> namecb;
    @FXML
    private Button approvebuttononmouseclick;
    @FXML
    private Button rejeectbuttononmouseclick;
    @FXML
    private Button generatereportbuttononmouseclick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Presentbuttonmouseclick(ActionEvent event) {
    }

    @FXML
    private void Absentbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void Recordbuttonmouseclick(ActionEvent event) {
    }
    
}
