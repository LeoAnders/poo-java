package ConstructorThis.ex01Product;

import ConstructorThis.entites.Product;

import java.util.Scanner;

//Primeiro exportamos nossa classe Product
public class ex01Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Update price: " + product.getPrice());

        System.out.println();
        System.out.println("product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("updated data: " + product);

        sc.close();
    }
}
