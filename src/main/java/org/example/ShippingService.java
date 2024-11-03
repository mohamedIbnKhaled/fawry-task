package org.example;

import java.util.List;

public class ShippingService {
       public void shipItems(List<ShippableItem> itemsToShip) {
        if(itemsToShip.isEmpty()){
            System.out.println("there is no items in the cart that need shipping ");
        }
        else{
        System.out.println("Shipping the following items:");
        for (ShippableItem item : itemsToShip) {
            System.out.println("Item: " + item.getName() + ", Weight: " + item.getWeight() + "kg");
        }
    }
    }
}
