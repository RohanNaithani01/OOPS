package org.example;

public class Main {
    public static void main(String[] args){
//        Car c1=new Car();
//        c1.carBrand="Tata";
//        c1.carColor="Black";
//        c1.carSpeed=120;
//
//        System.out.println(c1.carBrand);
//        System.out.println(c1.carColor);
//        System.out.println(c1.carSpeed);
//
//        c1.drive();
//
//        Employee employee=new Employee();
//
//        employee.setName("Rohan");
//        employee.setSalary(100000);
//
//        System.out.println(employee.getName());
//        System.out.println(employee.getsalary());
//
//        employee.showDetails();

        Account obj1=new Account("Rohan", 234000);
        System.out.println(obj1.getName());
        System.out.println(obj1.getBalance());

        Account obj2= new Account(obj1);

        System.out.println(obj2.getName());
        System.out.println(obj2.getBalance());
    }
}
