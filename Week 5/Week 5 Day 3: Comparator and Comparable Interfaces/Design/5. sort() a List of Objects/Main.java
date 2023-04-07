import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n = scn.nextInt();
        scn.nextLine(); 
        List<Hall> halls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the details of hall %d%n", i + 1);
            String[] parts = scn.nextLine().split(",");
            String name = parts[0];
            String contactNumber = parts[1];
            double costPerDay = Double.parseDouble(parts[2]);
            String ownerName = parts[3];
            Hall hall = new Hall(name, contactNumber, costPerDay, ownerName);
            halls.add(hall);
        }
        Collections.sort(halls);
        System.out.println("Sorted Order (from the least expensive to the most):");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Name", "Contact number", "Cost per day", "Owner name");
        for (Hall hall : halls) {
            System.out.println(hall);
        }
    }
}
