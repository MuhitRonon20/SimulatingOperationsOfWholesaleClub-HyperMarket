/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hyper_market;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Purchase  implements Serializable {
    
    private String productName;
    private Float unitPrice,quantity, vat,amount;
    private LocalDate purchaseDate;

    public Purchase(String productName, Float unitPrice, Float quantity, Float vat, Float amount, LocalDate purchaseDate) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.vat = vat;
        this.amount = amount;
        this.purchaseDate = purchaseDate;
    }

   
    
    
    public float getVatAmount()
    {
        float totalPrice = (this.unitPrice * this.quantity);
        float vatAmount = totalPrice * (this.vat / 100);
        return vatAmount;
    }
    
    public float getTotalAmount()
    {
        float totalPrice = (this.unitPrice * this.quantity);
        float totalAmount = totalPrice + this.getVatAmount();
        return totalAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getVat() {
        return vat;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Purchase{" + "productName=" + productName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", vat=" + vat + ", amount=" + amount + ", purchaseDate=" + purchaseDate + "\n";
    }
    


    
    
    
    
}

