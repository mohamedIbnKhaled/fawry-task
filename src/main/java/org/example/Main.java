package org.example;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 11, 3);
        Product chesse = new Product(0, "chesse", 40.0, 4, date,  true, 54);
        Product milk = new Product(1,"milk", 20.0,10,date,true,10);
        Product card= new Product(3, "card", 2, 12, date, false);
        Cart c1 =new Cart();
        c1.add(chesse, 3);
        c1.add(milk, 4);
        c1.add(card, 3);
        Customer cs1= new Customer(1, "Mohamed", 5445, c1);
        ShippingService ss= new ShippingService();
        ss.shipItems(c1.getShippaleItems());
        cs1.checkOut();
    }
}