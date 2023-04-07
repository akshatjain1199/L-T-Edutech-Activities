import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Customer c = new Customer();

        System.out.println("Enter the name");
        c.setName(sc.nextLine());

        System.out.println("Enter the accountType [Current , Savings, Demat]");
        c.setAccount(sc.nextLine());

        System.out.println("Enter the balance");
        c.setBalance(sc.nextDouble());

        int choice = 0;

        do {
            System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    c.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw");
                    c.withdrawal(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Number of Transactions done : " + Customer.getNoOfTransactions());
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 3);

  
    }
}
