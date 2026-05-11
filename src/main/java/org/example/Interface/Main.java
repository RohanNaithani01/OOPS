package org.example.Interface;

interface CarInterface{
    public void start();
    public void numberOfGears();

    default void airBags(){
        System.out.println("Car has 5 airbags");
    }

    static void printVehicleType(){
        System.out.println("It is a car");
    }

}

class ManualCar implements CarInterface{

    @Override
    public void start() {
        System.out.println("Manual car is starting...");
    }

    @Override
    public void numberOfGears() {
        System.out.println("Manul car has 6 gears");
    }
}
public class Main {
    public static void main(String[] args) {
        ManualCar manualCar=new ManualCar();
        manualCar.airBags();
        CarInterface.printVehicleType();
        manualCar.start();
        manualCar.numberOfGears();
    }
}
