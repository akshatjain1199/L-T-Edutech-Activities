import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the number of halls:");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<Hall> halls = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
        {
         // System.out.println("Enter the details of hall " + i + ":");
            String[] hallDetails = scanner.nextLine().split(",");
            String name = hallDetails[0];
            Double costPerDay = Double.parseDouble(hallDetails[1]);
            String owner = hallDetails[2];
            halls.add(new Hall(name, costPerDay, owner));
        }
        
        Collections.sort(halls, (h1, h2) -> h1.getOwner().compareTo(h2.getOwner()));
        
        System.out.format("%-15s %-10s %s\n", "Name", "Cost", "Owner");
        for (Hall hall : halls) 
        {
            System.out.format("%-15s %-10s %s\n", hall.getName(), hall.getCostPerDay(), hall.getOwner());
        }
    }
}
