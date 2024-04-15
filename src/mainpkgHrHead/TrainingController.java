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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class TrainingController implements Initializable {

    @FXML
    private TableView<?> Tvtraining;
    @FXML
    private TableColumn<?, ?> tvclmtrainingilte;
    @FXML
    private TableColumn<?, ?> tvclmdate;
    @FXML
    private TableColumn<?, ?> tvclmtrainer;
    @FXML
    private Label trainingtitlelbl;
    @FXML
    private Label trainerlbl;
    @FXML
    private Label trainingdatelbl;
    @FXML
    private TextField traininngtitletf;
    @FXML
    private ComboBox<?> trainerccb;
    @FXML
    private ComboBox<?> trainingdatecb;
    @FXML
    private TableView<?> tvlist;
    @FXML
    private TableColumn<?, ?> tvclmlistname;
    @FXML
    private TableColumn<?, ?> tvlistcontact;
    @FXML
    private Label listlbl;
    @FXML
    private Label namelbl;
    @FXML
    private TextField nametf;
    @FXML
    private TextField contacttf;
    @FXML
    private Label contactlbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewbuttonmouseclick(ActionEvent event) {
    }

    @FXML
    private void savebuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void addbuttonmouseclick(ActionEvent event) {
    }

    @FXML
    private void deletebuttonmouseclick(ActionEvent event) {
    }
    
}
