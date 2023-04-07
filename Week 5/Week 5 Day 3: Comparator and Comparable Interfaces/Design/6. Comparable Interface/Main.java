import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n = scn.nextInt();
        scn.nextLine(); 
        List<Address> addresses = new ArrayList<>();
		System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
        for (int i = 0; i < n; i++) {
            
            String[] parts = scn.nextLine().split(",");
            String username = parts[0];
            String addressLine1 = parts[1];
            String addressLine2 = parts[2];
            int pinCode = Integer.parseInt(parts[3]);
            Address address = new Address(username, addressLine1, addressLine2, pinCode);
            addresses.add(address);
        }
        Collections.sort(addresses);
        System.out.println("User Details:");
        for (Address address : addresses) {
            System.out.println(address);
        }
    }
}
