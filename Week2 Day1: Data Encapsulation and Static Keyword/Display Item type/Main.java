import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the item type name");
        String name = scanner.nextLine();

        System.out.println("Enter the cost per day");
        double costPerDay = scanner.nextDouble();

        System.out.println("Enter the deposit");
        double deposit = scanner.nextDouble();

        ItemType itemType = new ItemType();
        itemType.setName(name);
        itemType.setCostPerDay(costPerDay);
        itemType.setDeposit(deposit);

        itemType.display();
    }
}
