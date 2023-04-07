import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of address ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Map<String, List<Address>> cityAddressMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the address " + i + " detail ");
            String[] addressStrArray = scanner.nextLine().split(",");
            Address address = new Address(addressStrArray[0].trim(), addressStrArray[1].trim(), addressStrArray[2].trim(),
                    addressStrArray[3].trim(), Integer.parseInt(addressStrArray[4].trim()));
            Address.generateCityAddressMap(cityAddressMap, address);
        }

        System.out.println("Enter the city to be searched");
        String searchCity = scanner.nextLine().trim();

        List<Address> addresses = Address.searchCity(cityAddressMap, searchCity);
        if (addresses.isEmpty()) {
            System.out.println("Searched city not found");
        } else {
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
            for (Address address : addresses) {
                System.out.printf("%-15s %-15s %-15s %-15s %d\n", address.getAddressLine1(), address.getAddressLine2(),
                        address.getCity(), address.getState(), address.getPincode());
            }
        }

 
    }
}
