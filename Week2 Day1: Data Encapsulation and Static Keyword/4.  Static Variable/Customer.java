import java.util.Scanner;

class Customer {
    private String name;
    private String account;
    private double balance;
    private static int noOfTransactions;

    // Constructor
    public Customer(String name, String account, double balance) {
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Functions
    public void deposit(double amount) {
        balance += amount;
        noOfTransactions++;
        System.out.println("Your balance after the transaction is : " + balance);
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            noOfTransactions++;
            System.out.println("Your balance after the transaction is : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Static variable getter
    public static int getNoOfTransactions() {
        return noOfTransactions;
    }
}
