package org.example;
import java.time.LocalDate;
public class Product extends Exception implements ShippableItem {
    private int id;
    private String productName;
    private  double price ;
    private  int quantity;
    private LocalDate expiryDate;
    private boolean needShipping;
    private double weight;

    public Product(int id,String productName,double price,int quantity,LocalDate expiryDate, boolean  needShipping,double weight ) {
        setId(id);
        setProductName(productName);
        setPrice(price);
        setQuantity(quantity);
        if (expiryDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Product has expired.");
        }else{
        setExpiryDate(expiryDate);
    }
        setNeedShipping(needShipping);
        if(this.needShipping){
            setWeight(weight);
        }
    }
    public Product(int id,String productName,double price,int quantity,LocalDate expiryDate, boolean  needShipping){
        //constructor overloading to handle cases where a product does not need shipping. 
    
        this(id,productName,price,quantity,expiryDate,needShipping,0);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String getName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("You can't make product with negative price ");
        }else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<0){
            System.out.println("You can't make product with negative quantity");
        }else {
            this.quantity = quantity;
        }
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        
        this.expiryDate = expiryDate;
    }

    public boolean isNeedShipping() {
        return needShipping;
    }

    public void setNeedShipping(boolean needShipping) {
        this.needShipping = needShipping;
    }
    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(needShipping&&weight<=0){
            System.out.println("You can't make product with negative weight");
        }
        else {
            this.weight = weight;
        }
    }
    
    public void displayProductInfo(){
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        if(needShipping&&this.weight>0){
        System.out.println("Product weight: " + weight);
        }
        System.out.println("Expiry Date: " + expiryDate);
    }

}
