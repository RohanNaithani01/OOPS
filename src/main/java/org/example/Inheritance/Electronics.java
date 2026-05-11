package org.example.Inheritance;

public class Electronics extends Product{
    private int warrantyPeriodInYears;
    private String brand;
    Electronics(int warrantyPeriodInYears, String brand, String name, double price){
        super(name, "Electronics", price);
        this.warrantyPeriodInYears=warrantyPeriodInYears;
        this.brand=brand;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Warranty: "+warrantyPeriodInYears);
        System.out.println("Brand: "+brand);
    }
}
