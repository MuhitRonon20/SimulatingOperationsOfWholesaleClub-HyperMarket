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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class RecruitmentSelectController implements Initializable {

    @FXML
    private TableView<?> applicanttv;
    @FXML
    private TableColumn<?, ?> tvclmname;
    @FXML
    private TableColumn<?, ?> tvclmstattus;
    @FXML
    private Label applicantlistlbl;
    @FXML
    private Label applicantnamelbl;
    @FXML
    private TextField applicantnametf;
    @FXML
    private TableView<?> tvshortlist;
    @FXML
    private TableColumn<?, ?> tvstatus;
    @FXML
    private TableColumn<?, ?> tvname;
    @FXML
    private Label shortlistlbl;
    @FXML
    private ComboBox<?> shortlistcb;
    @FXML
    private Label shortapplicantlistlbl;
    @FXML
    private Label slelecttedapplicantlbl;
    @FXML
    private ComboBox<?> slctapplicentcb;
    @FXML
    private TextArea msgtf;
    @FXML
    private Label msglbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void shortlistbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void rejectbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void selectedbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void rejectforshortlistbuttonOnmouseclick(ActionEvent event) {
    }

    @FXML
    private void sendbuttononmouseclick(ActionEvent event) {
    }
    
}
