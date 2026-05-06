package org.example.Inheritance;

public class Product {
    private String name;
    private String category;
    private double price;
    Product(String name, String category, double price){
        this.name=name;
        this.category=category;
        this.price=price;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Category: "+category);
    }
}
