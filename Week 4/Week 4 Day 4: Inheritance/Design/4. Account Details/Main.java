import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter account Detail:");
        String detail = scn.nextLine();
        
        AccountBO accountBO = new AccountBO();
        FixedAccount account = accountBO.getAccountDetail(detail);
        System.out.println("Account Details:");
        System.out.format("%-20s %-10s %-20s %-20s %s\n", "Account Number", "Balance", "Account holder name", "Minimum balance", "Locking period");
        System.out.format("%-20s %-10.2f %-20s %-20.1f %d\n", account.getAccountNumber(), account.getBalance(), account.getAccountHolderName(), account.getMinimumBalance(), account.getLockingPeriod());
    }
}
