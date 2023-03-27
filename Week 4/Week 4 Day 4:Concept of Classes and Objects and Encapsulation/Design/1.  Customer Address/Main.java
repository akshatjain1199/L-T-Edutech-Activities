import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Address a = new Address();

        System.out.println("Enter Customer Address");

        System.out.println("Enter the street");
        a.street = scn.nextLine();

        System.out.println("Enter the city");
        a.city = scn.nextLine();

        System.out.println("Enter the pincode");
        a.pincode = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter the country");
        a.country = scn.nextLine();

        a.displayAddress();
    }
}
