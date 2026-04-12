package org.example;

public class Encapsulation {
    public static void main(String[] args) {
        Bank account=new Bank("Rohan", 980978723,230000);

        System.out.println(account.getName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());

        account.addAmount(100000);
        account.withdrawAmount(1000);

        System.out.println(account.getName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
    }
}
