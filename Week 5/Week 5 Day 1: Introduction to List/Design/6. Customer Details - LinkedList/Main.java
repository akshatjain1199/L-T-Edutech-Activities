

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Customer> customers = new LinkedList<>();
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                String phoneNo = fields[2];
                Customer customer = new Customer(name, email, phoneNo);
                customers.push(customer);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s\n", "Customer Name", "Email", "Phone Number");
        System.out.println("--------------------------------------------------------------------------------------");
        for (Customer customer : customers) {
            System.out.printf("%-20s %-20s %-20s\n", customer.getName(), customer.getEmail(), customer.getPhoneNo());
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
}
