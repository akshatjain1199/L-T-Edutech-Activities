import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting customer details
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the accountType [Current, Savings, Demat]");
        String account = scanner.nextLine();
        System.out.println("Enter the balance");
        double balance = scanner.nextDouble();

        // Creating customer object
        Customer customer = new Customer(name, account, balance);

        int choice = 0;

        // Transactions
        while (choice != 3) {
            System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double withdrawAmount = scanner.nextDouble();
                    customer.withdrawal(withdrawAmount);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        System.out.println("Number of Transactions done : " + Customer.getNoOfTransactions());

    }
}
