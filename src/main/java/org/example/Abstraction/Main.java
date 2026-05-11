package org.example.Abstraction;

abstract class Car{
    abstract public void start();
    public void noise(){
        System.out.println("Noice.....");
    }
}

abstract class Dealer extends Car{
    int numberOfCars;

    Dealer(){
        System.out.println("Dealer Constructor");
    }
    Dealer(int numberOfCars){
        this.numberOfCars=numberOfCars;

    }
}
class AutomaticCar extends Dealer{
    public void start(){
        System.out.println("Automatic car is starting");
    }
    AutomaticCar(int number){
        super(number);
        System.out.println("No of cars:"+ number);

    }
}
interface CarInterface{
    public void start();
    default void noise(){
        System.out.println("Noice....");
    }
    static void NoOfWheels(){
        System.out.println("4 wheels");
    }
}

class ManualCar implements CarInterface{
    public void start(){
        System.out.println("Manual Car is starting");
    }
    public void printName(){
        System.out.println("Hey I am manual");
    }
}


public class Main {
    public static void main(String[] args) {
        ManualCar manualCar=new ManualCar();
        manualCar.start();
        manualCar.noise();
        manualCar.printName();
        CarInterface.NoOfWheels();
        AutomaticCar automaticCar=new AutomaticCar(12);
        automaticCar.start();
    }
}
