package org.example;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 11, 3);
        Product chesse = new Product(0, "chesse", 40.0, 4, date,  true, 54);
        
        Cart c1 =new Cart();
        c1.add(chesse, 3);
        Customer cs1= new Customer(1, "Mohamed", 5445, c1);
        cs1.checkOut();
    }
}