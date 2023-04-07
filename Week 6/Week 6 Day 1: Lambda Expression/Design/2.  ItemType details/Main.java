import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of item types:");
        int n = sc.nextInt();
        sc.nextLine(); 

        List<ItemType> itemTypes = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            String[] details = sc.nextLine().split(",");
            String name = details[0];
            double costPerDay = Double.parseDouble(details[1]);
            double deposit = Double.parseDouble(details[2]);
            ItemType itemType = new ItemType(name, costPerDay, deposit);
            itemTypes.add(itemType);
        }

        Collections.sort(itemTypes, Comparator.comparing(ItemType::getName));

        System.out.format("%-10s %-10s %s%n", "Name", "Cost", "Deposit");
        for (ItemType itemType : itemTypes) 
        {
            System.out.format("%-10s %-10.1f %.1f%n", itemType.getName(), itemType.getCostPerDay(), itemType.getDeposit());
        }
    }
}
