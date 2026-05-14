package org.example;

public class Main {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Hue", 1000);

        BankService service =
                new BankService();

        service.deposit(account, 500);
        service.deposit(account, -50);
    }
}