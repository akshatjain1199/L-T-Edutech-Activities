import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Customer Details");
        System.out.println("Enter the name");
        String name = scn.nextLine();
        System.out.println("Enter the email");
        String email = scn.nextLine();
        System.out.println("Enter the type");
        String type = scn.nextLine();
        System.out.println("Enter the location");
        String location = scn.nextLine();

        Customer c = new Customer(name, email, type, location);

        System.out.println("Customer Details");
        System.out.println("Name: " + c.getCustomerName());
        System.out.println("E-mail: " + c.getCustomerEmail());
        System.out.println("Type: " + c.getCustomerType());
        System.out.println("Location: " + c.getCustomerLocation());
    }
}
