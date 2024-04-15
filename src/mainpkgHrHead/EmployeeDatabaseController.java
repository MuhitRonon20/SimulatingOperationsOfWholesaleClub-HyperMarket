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
public class EmployeeDatabaseController implements Initializable {

    @FXML
    private Label namelbl;
    @FXML
    private Label dptlvl;
    @FXML
    private Label pos;
    @FXML
    private TextField nametf;
    @FXML
    private TextField dpttf;
    @FXML
    private TextField postf;
    @FXML
    private TableView<?> TVemplydb;
    @FXML
    private TableColumn<?, ?> tvcllmname;
    @FXML
    private TableColumn<?, ?> tvclmdpt;
    @FXML
    private TableColumn<?, ?> tvclmpos;
    @FXML
    private Label searchlbl;
    @FXML
    private TextField searchtf;
    @FXML
    private Label searchoutputlbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void savbuttononmouseclick(ActionEvent event) {
    }

    @FXML
    private void refreshonmouseclick(ActionEvent event) {
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
