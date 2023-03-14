import java.util.*;
public class Main {
    public static void main(String[] args) {
              Scanner scn = new Scanner(System.in);
              Address a= new Address();
        
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        String street = scn.nextLine();
        a.street= street;
        System.out.println("Enter the city");
        String city = scn.nextLine();
        a.city=city;
        
        System.out.println("Enter the pincode");
   int  pincode= Integer.parseInt(scn.nextLine());
    a.pincode= pincode;    
        System.out.println("Enter the country");
        String country = scn.nextLine();
        a.country=country;
      
        
        a.displayAddress();
    }
}
