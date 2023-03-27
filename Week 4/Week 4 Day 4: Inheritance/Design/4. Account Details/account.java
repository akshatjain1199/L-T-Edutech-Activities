import java.util.Scanner;

class Account {
    protected String accountNumber;
    protected Double balance;
    protected String accountHolderName;
    
    public Account(String accountNumber, Double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
}
