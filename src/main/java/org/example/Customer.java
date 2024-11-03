package org.example;

public class Customer {
    private int id;
    private String name;
    private double balance;
    private Cart myCart;
    public Customer(int id,String name,double balance,Cart myCart){
        setId(id);
        setName(name);
        setBalance(balance);
        this.myCart=myCart;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void addFund(double fund){
        if(fund>0){
            balance+=fund;
        }else{
            System.out.println("You can't add fund with less or equal to 0");
        }
    }
    public void checkOut(){
        if(myCart.getAmount()>balance){
            System.out.println("Your balance is less than the amount of the cart");
            setBalance(balance-myCart.getAmount());
        }
        else if(!myCart.cartIsEmpty()){
            myCart.displayItems();
            setBalance(balance-myCart.getAmount());
            System.out.println("The checkout have been completed successfully :)");
            myCart.clear();
        }
        else {
            System.out.println("You didn't put any thing in the cart yet. ");
        }
    }

}
