import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Item Type");
        int n = scanner.nextInt();
        ItemType[] itemTypeArray = new ItemType[10];
        ItemTypeBO itemTypeBO = new ItemTypeBO();
        for (int i = 1; i <= n; i++) {
            scanner.nextLine();
            System.out.println("Enter the Item Type " + i + " Name");
            String name = scanner.nextLine();
            System.out.println("Enter the Deposit Amount");
            Double deposit = scanner.nextDouble();
            System.out.println("Enter the Cost per day");
            Double costPerDay = scanner.nextDouble();
            ItemType item = new ItemType(name, deposit, costPerDay);
            itemTypeBO.add(item, itemTypeArray, i-1);
        }
        itemTypeBO.display(itemTypeArray);
        scanner.nextLine();
        System.out.println("Enter the Name of the item to be searched");
        String search = scanner.nextLine();
        itemTypeBO.search(search, itemTypeArray);
        scanner.close();
    }
}
