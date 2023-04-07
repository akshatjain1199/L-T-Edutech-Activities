import java.util.Scanner;

public class Customer {
    private String name;
    private String account;
    private double balance;
    private static int noOfTransactions;

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

    public static int getNoOfTransactions() {
        return noOfTransactions;
    }

    public static void setNoOfTransactions(int noOfTransactions) {
        Customer.noOfTransactions = noOfTransactions;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Your balance after the transaction is : " + balance);
        noOfTransactions++;
    }

    public void withdrawal(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Your balance after the transaction is : " + balance);
            noOfTransactions++;
        }
    }
}
