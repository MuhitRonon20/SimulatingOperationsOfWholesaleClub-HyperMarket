/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hyper_market;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PurchaseController implements Initializable {

    @FXML
    private ComboBox<String> selectProductComboBox;
    @FXML
    private ComboBox<Integer> quantityComboBox;
    private TextArea billTextArea;
    @FXML
    private Label unitPriceLabel;
    @FXML
    private Label predefinedVatLabel;
    @FXML
    private DatePicker purchaseDateDatePicker;
    
    
    
    
    private float[] prices = {100, 200, 150, 300, 150, 100, 200, 250, 150, 350};
    private float[] predefinedVats = {4, 5, 15, 10, 11, 1, 2, 4, 6, 7};
    @FXML
    private TableView<Purchase> cartItemTableView;
    @FXML
    private TableColumn<Purchase, String> productNameTabCol;
    @FXML
    private TableColumn<Purchase, String> unitPriceTabCol;
    @FXML
    private TableColumn<Purchase, String> quantityTabCol;
    @FXML
    private TableColumn<Purchase, String> vatTabCol;
    @FXML
    private TableColumn<Purchase, String> purchaseDateTabCol;
    @FXML
    private TableColumn<Purchase, Integer> amountTabCol;
    private ObservableList<Purchase> prList;

    /**
       
}String productName, Float unitPrice, Float quantity, Float vat, LocalDate purchaseDate
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productNameTabCol.setCellValueFactory(new PropertyValueFactory <Purchase, String>("productName"));
        unitPriceTabCol.setCellValueFactory(new PropertyValueFactory <Purchase, String>("unitPrice"));
        quantityTabCol.setCellValueFactory(new PropertyValueFactory <Purchase, String>("quantity"));
        vatTabCol.setCellValueFactory(new PropertyValueFactory <Purchase, String>("vat"));
        purchaseDateTabCol.setCellValueFactory(new PropertyValueFactory <Purchase, String>("purchaseDate"));
        amountTabCol.setCellValueFactory(new PropertyValueFactory <Purchase, Integer>("amount"));
       // productNameTabCol.setCellValueFactory(new PropertyValueFactory <Purchase, String>("orId"));
        
        
        
        
        for (int i=1; i<=10; i++)
        {
          
                quantityComboBox.getItems().add(i);
                       
            
        }
        
        
        selectProductComboBox.getItems().addAll(
                "Lux Soap White 100gm",
                "Potato Crackers Chips",
                "Digestive Chocolate Biscuit",
                "Mister Twist Chips",
                "Bisk Club Potato Chips",
                "Aarong Cheese",
                "Aarong Milk",
                "Starship Chocolate Milk",
                "Cadbury Dairy Milk Silk 250gm",
                "Polar Mango Ice Cream 500gm"
        );
    }  
        // TODO
       

    @FXML
    private void selectProductComboBoxOnItemSelected(ActionEvent event) {
        String selectedItem = selectProductComboBox.getSelectionModel().getSelectedItem();
        
        unitPriceLabel.setText(Float.toString(prices[selectProductComboBox.getItems().indexOf(selectedItem)]));
        predefinedVatLabel.setText(Float.toString(predefinedVats[selectProductComboBox.getItems().indexOf(selectedItem)]));
        
        
    }

    @FXML
    private void addProductToCartButtonOnClick(ActionEvent event) throws IOException {
        
        String productName = selectProductComboBox.getSelectionModel().getSelectedItem();
        Float unitPrice= prices[selectProductComboBox.getItems().indexOf(productName)];
        Float vat= predefinedVats[selectProductComboBox.getItems().indexOf(productName)];
        //String productName = selectProductComboBox.getValue();
        float quantity = quantityComboBox.getValue();
        float totalPrice = (unitPrice * quantity);
        float vatAmount = totalPrice * (vat / 100);
        
        float totalPrice2 = (unitPrice * quantity);
        float totalAmount = totalPrice2 + vatAmount;
        
        Boolean addstatus= 
                Customer.addCart(
        //String productName, Float unitPrice, Float quantity, Float vat, Float amount, LocalDate purchaseDate
        
                productName,
                unitPrice,
                quantity,
                vat,
                totalAmount,
                purchaseDateDatePicker.getValue());
       
        
        if(addstatus){

                        Alert a=new Alert(Alert.AlertType.INFORMATION);
                        a.setContentText("New Item Added Sucussfully");
                        a.showAndWait();
                    }
                    else{

                        Alert a =new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Error");
                        a.showAndWait();

                }
    }

    @FXML
    private void checkOutAndShowBillButtonOnClick(ActionEvent event) {
        
        cartItemTableView.getItems().clear();
        
       
                
                prList = Customer.ShowItem();
        
                for (Purchase prd: prList){
            
                 cartItemTableView.getItems().add(prd);
                        
            
        }
        
}

    @FXML
    private void backOnMouseClicked(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("customerdb.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();
    }
    
}
    
   