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
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class FeedbackController implements Initializable {

    @FXML
    private TableView<?> TVfb;
    @FXML
    private TableColumn<?, ?> tvclmemply;
    @FXML
    private TableColumn<?, ?> tvclmdpt;
    @FXML
    private TableColumn<?, ?> tvclmstatus;
    @FXML
    private Label empyfblbl;
    @FXML
    private TextArea descreptionoutputlbl;
    @FXML
    private ComboBox<?> avlblcb;
    @FXML
    private Label avlbllbl;
    @FXML
    private Label descripptionlbl;
    @FXML
    private Button channelbuttononmouseclick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewfbbuttonmouseclick(ActionEvent event) {
    }
    
}
