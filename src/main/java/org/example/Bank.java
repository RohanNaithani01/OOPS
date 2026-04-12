package org.example;

public class Bank {
    private double balance;
    private final String name;
    private final long accountNumber;

    public Bank(String name, long accountNumber, double balance){
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void addAmount(double amount){
        if(amount>=0){
            this.balance+=amount;
            System.out.println("Amount Added");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    public void withdrawAmount(double amount){
        if(this.balance>=amount & amount>=0){
            this.balance-=amount;
            System.out.println("Amount Deducted: "+amount);
        }
        else {
            System.out.println("Invalid Amount");
        }
    }


}
