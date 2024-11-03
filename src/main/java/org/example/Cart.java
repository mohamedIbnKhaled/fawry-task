package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class Cart {
    private Map<Product,Integer> items;//aggregation relationship
    private double subTotal=0;
    private double shipping=0;
    private double packageWeight=0;
    public Cart(){
        this.items=new HashMap<>();
    }
    public double getSubTotal(){
        return subTotal;
    }
    public double getShipping(){
        return shipping;
    }
    //method to make user can add items to the cart
    public void add(Product product,int quantity){
        if(quantity<=0){
            throw new IllegalArgumentException("Quantity must be greater than 0.");
        }else{
            int quantityleft=product.getQuantity();
            //check if we have quantity left in the store for the user's need
            if(quantity>quantityleft){
                System.out.println("We only have this quantity of this product: "+quantityleft);
            }else{
                if(items.containsKey(product)){
                    items.put(product, items.get(product) + quantity);
                }else{
                    items.put(product, quantity);
                }
                subTotal+=product.getPrice()*quantity;
                if(product.isNeedShipping()){
                    shipping+=(product.getWeight()*.2*quantity);
                    packageWeight+=product.getWeight()*quantity;
                }
                product.setQuantity(quantityleft-quantity);
            }
        }
    }
    //to  remove items form the cart
    public void remove(Product product,int quantityToRemove){
        if(items.containsKey(product)){
            int userQuantity=items.get(product);
            if(quantityToRemove>userQuantity){
                System.out.println("The cart only have: "+userQuantity);
            }
            else{
                if( userQuantity-quantityToRemove==0)items.remove(product);
                else{
                items.put(product, userQuantity-quantityToRemove);
            }
            }
        }else{
            System.out.println("The cart doesn't contain the item ");
        }
    }
    public double getAmount(){
        return subTotal+shipping;
    }
    public boolean cartIsEmpty(){
        return items.isEmpty();
    }
    // get all the shippla items in list 
    public List<ShippableItem>getShippaleItems(){
        List<ShippableItem> shippableItems = new ArrayList<>();
        for(var item:items.entrySet()){
            if(item.getKey().isNeedShipping()){
                shippableItems.add(item.getKey());
            }
        }
        return shippableItems;
    }
    public void displayItems(){
        if(items.isEmpty()){
            System.out.println("The cart don't have any items ");
        }else{
             Map<Product,Integer> shippableItems=new HashMap<>();
             Map<Product,Integer> unShippableItems=new HashMap<>();
            for(var item:items.entrySet()){
                if(item.getKey().isNeedShipping()){
                    shippableItems.put(item.getKey(),item.getValue());
                }
                else{
                    unShippableItems.put(item.getKey(),item.getValue());
                }
            }
            if(!shippableItems.isEmpty()){
                System.out.println("** Shipment notice **");
                for(var item:shippableItems.entrySet()){
                    System.out.println(item.getValue()+" x "+ item.getKey().getName()+"      " + item.getKey().getWeight());
                }
                System.out.println("\nTotal package weight "+ packageWeight);
            }
            if(!unShippableItems.isEmpty()){
                System.out.println("\n** Un Shipment items **");
                for(var item:unShippableItems.entrySet()){
                    System.out.println(item.getValue()+" x "+ item.getKey().getName());
                }
            }
            System.out.println("\nThe sub total = "+getSubTotal());
            System.out.println("the shipping = "+getShipping());
            System.out.println("the total amount is "+getAmount());
        }

    }
    public void  clear(){
        if(!items.isEmpty()){
            items.clear();
        }
    }


}
