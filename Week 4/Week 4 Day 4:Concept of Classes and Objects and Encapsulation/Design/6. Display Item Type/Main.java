import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        ItemType it = new ItemType();

        System.out.println("Enter the item type name");
        String name = scn.nextLine();
        it.setName(name);

        System.out.println("Enter the cost per day");
        double costPerDay = scn.nextDouble();
        it.setCostPerDay(costPerDay);

        System.out.println("Enter the deposit");
        double deposit = scn.nextDouble();
        it.setDeposit(deposit);

        it.display();
    }
}
