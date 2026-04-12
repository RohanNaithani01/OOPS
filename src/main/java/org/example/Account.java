package org.example;

public class Account {
    private String name;
    private int balance;


    //non-parameterized Constructor
    public Account(){
        balance=100;
    }
    //parameterized Constructor
    public Account(String name,int balance){
        this.name=name;
        this.balance=balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //Copy Constructor
    public Account(Account account){
        this(account.getName(), account.getBalance());
    }

}
