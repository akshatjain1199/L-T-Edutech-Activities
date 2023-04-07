import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        ArrayList<ItemType> itemTypes = new ArrayList<>();
        int itemTypeCounter = 1;
        while (true) {
            System.out.println("Enter the details of Item Type " + itemTypeCounter);
            System.out.println("Name:");
            String name = scn.nextLine();
            System.out.println("Deposit:");
            Double deposit = scn.nextDouble();
            scn.nextLine();
            System.out.println("Cost per Day:");
            Double costPerDay = scn.nextDouble();
            scn.nextLine();
            ItemType itemType = new ItemType(name, deposit, costPerDay);
            itemTypes.add(itemType);
            itemTypeCounter++;
            System.out.println("Do you want to continue?(y/n) ");
            String continueChoice = scn.nextLine();
            if (!continueChoice.equalsIgnoreCase("y")) {
                break;
            }
        }
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
        for (ItemType itemType : itemTypes) {
            System.out.println(itemType);
        }
    }
}
