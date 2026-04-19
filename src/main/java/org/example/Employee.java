package org.example;

public class Employee {
    private String name;
    private int salary;

    public String getName(){
        return name;
    }
    public int getsalary(){
        return salary;
    }

    public void setName(String name){
        this.name=name;
    }



    public void showDetails(){
        System.out.println(name);
        System.out.println(salary);
    }

}
