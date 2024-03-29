/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyper_market;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;

/**
 *String productName, Float unitPrice, Float quantity, Float vat, LocalDate purchaseDate
 * @author Admin
 */
public class Customer extends User implements Serializable{
    public static boolean addCart(String productName, Float unitPrice, Float quantity, Float vat, Float amount, LocalDate purchaseDate) throws FileNotFoundException, IOException{
       
        Purchase newMember =new Purchase(
                    
               productName,unitPrice,quantity,vat,amount,purchaseDate
                      
        
        );
        
        File f = new File("purchase.bin");

try {
    FileOutputStream fos;
    ObjectOutputStream oos;

    if (f.exists()) {
        fos = new FileOutputStream(f, true); // Append mode
        oos = new AppendableObjectOutputStream(fos);
    } else {
        fos = new FileOutputStream(f);
        oos = new ObjectOutputStream(fos);
    }

    oos.writeObject(newMember);
    oos.close();
    fos.close();
    
        return true;
    } 
    catch (IOException e) {
        return false;
    }
    catch(Exception m )
      {
    Alert a =new Alert(Alert.AlertType.ERROR);
    a.setContentText("Please Enter All Input");
    a.showAndWait();

    return false;   
      }
    
    }
    
/*
    
    */    
    public static ObservableList<Purchase> ShowItem(){ 
        
        //ArrayList<Member> memList = new ArrayList();
        ObservableList<Purchase> prdList = FXCollections.observableArrayList();
        //ObservableList<Member> allPeople = FXCollections.observableArrayList();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("purchase.bin"))){
            
            while(true){
                try{
                    Purchase pr = (Purchase)ois.readObject();
                     
                    prdList.add(pr);
                }catch(EOFException e){
                    break;
                }catch(ClassNotFoundException e){
                   System.err.println("Class not Found");
                }
            }
        }catch(FileNotFoundException e){
                    System.err.println("File not Found");
        }catch(IOException e){
                    System.err.println("IO exception" + e.getMessage());
        }
        
        return prdList;
        
    }
}