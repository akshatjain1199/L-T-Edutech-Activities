import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Choose Account Type");
        System.out.println("1.Savings Account");
        System.out.println("2.Current Account");
        int choice = scn.nextInt();
        scn.nextLine(); 

        
        String[] input = scn.nextLine().split(",");
        String accName = input[0];
        String accNo = input[1];
        String bankName = input[2];

        switch (choice) {
            case 1:
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
                String orgName = input[3];
                SavingsAccount savingsAccount = new SavingsAccount(accName, accNo, bankName, orgName);
                savingsAccount.display();
                break;
            case 2:
            System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                String tinNumber = input[3];
                CurrentAccount ca = new CurrentAccount(accName, accNo, bankName, tinNumber);
                ca.display();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}


