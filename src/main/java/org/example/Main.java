package org.example;

public class Main {
    public static void main(String[] args){
        Car c1=new Car();
        c1.carBrand="Tata";
        c1.carColor="Black";
        c1.carSpeed=120;

        System.out.println(c1.carBrand);
        System.out.println(c1.carColor);
        System.out.println(c1.carSpeed);

        c1.drive();

    }
}
