import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the country name");
        String name = scn.nextLine();
        System.out.println("Enter the country code");
        String countryCode = scn.nextLine();
        System.out.println("Enter the isd code");
        String isdCode = scn.nextLine();

        Country c = new Country(name, countryCode, isdCode);

        c.display();
    }
}
