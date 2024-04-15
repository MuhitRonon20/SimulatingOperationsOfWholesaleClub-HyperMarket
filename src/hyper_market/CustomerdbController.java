/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hyper_market;

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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MUHIT
 */
public class CustomerdbController implements Initializable {

    @FXML
    private Button buyProductButton;
    @FXML
    private Button getMembershipButton;
    @FXML
    private Button feedbackaAndReviewButton;
    @FXML
    private Button customerSupportButton;
    @FXML
    private Button returnsAndExchangesButton;
    @FXML
    private Button customerSupportButton1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void getMembershipOnMouseClicked(ActionEvent event) throws IOException {
          Parent scene2Parent = FXMLLoader.load(getClass().getResource("Get Membership.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
        
    }

    @FXML
    private void feedbackAndReviewOnMouseClicked(ActionEvent event) throws IOException {
              Parent scene2Parent = FXMLLoader.load(getClass().getResource("feedbackandreview.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void customerSupportOnMouseClicked(ActionEvent event) throws IOException {
                  Parent scene2Parent = FXMLLoader.load(getClass().getResource("customer&support.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
        
    }

    @FXML
    private void returnsAndExchangesOnMouseClicked(ActionEvent event) throws IOException {
                  Parent scene2Parent = FXMLLoader.load(getClass().getResource("Returns and Exchanges.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }

    @FXML
    private void purchaseOnMouseClicked(ActionEvent event) throws IOException {
          
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Purchase.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
}

    @FXML
    private void orderAndPaymentOptionOnMouseClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("orderandpaymentoption.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         
    }
    
}
