package org.example.Inheritance;

public class TShirt extends Product{
    private String size;
    private String color;

    TShirt(String size, String color, double price, String name){
            super(name, "Tshirt",price);
            this.size=size;
            this.color=color;
    }
@Override
    void displayDetails(){
        System.out.println("Size: "+ size);
        System.out.println("color: "+color);
    }
}
