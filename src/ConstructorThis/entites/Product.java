package ConstructorThis.entites;

public class Product {

    //Encapsulation
    private String name;
    private double price;
    private int quantity;



    //Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    //Encapsulation

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
      return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    //We change the quantity only when we have an entry or exit from stock that way protect the integrity of our product
    public int getQuantity(){
        return quantity;
    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f",totalValueInStock());
    }
}
