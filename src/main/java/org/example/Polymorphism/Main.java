package org.example.Polymorphism;

public class Main {
    public static void main(String[] args) {
        calculator calculator= new calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1.3,1.77));
        System.out.println(calculator.add(1,3,34));

    }
}
class calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
