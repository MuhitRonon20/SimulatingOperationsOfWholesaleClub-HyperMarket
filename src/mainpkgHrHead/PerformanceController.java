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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

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

    @FXML
    private void BackButtononmouseclick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("HrHead.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }
    
}
