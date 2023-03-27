import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        String customerName = scn.nextLine();
        System.out.println("Enter the email");
        String customerEmail = scn.nextLine();
        System.out.println("Enter the type");
        String customerType = scn.nextLine();
        System.out.println("Enter the location");
        String customerAddress = scn.nextLine();


        Customer c = new Customer(customerName, customerEmail, customerType, customerAddress);


        c.displayDetails();

        
    }
}
