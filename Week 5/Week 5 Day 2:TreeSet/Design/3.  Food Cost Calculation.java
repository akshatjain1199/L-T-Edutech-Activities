import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Food> foodSet = new TreeSet<Food>((f1, f2) -> Double.compare(f2.getAmount(), f1.getAmount()));
        String item;
        double amount;
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("Enter item");
            item = in.nextLine();
            System.out.println("Enter amount(Dinar)");
            amount = in.nextDouble();
            in.nextLine(); 
            Food food = new Food(item, amount);
            foodSet.add(food);
            System.out.println("Do you want to continue(yes/no):");
            choice = in.nextLine().toLowerCase();
        }
        System.out.println("Total dinar required is:");
        System.out.printf("%-15s %-15s%n", "Item", "Amount(Dinar)");
        double totalAmount = 0.0;
        for (Food food : foodSet) {
            System.out.printf("%-15s %-15d%n", food.getItem(), (int) food.getAmount());
            totalAmount += food.getAmount();
        }
        System.out.println("Total amount needed in Dinar: " + (int) totalAmount);
        System.out.println("Total amount needed in Rupees: " + String.format("%.2f", totalAmount * 18.565));
    }
}

class Food {
    private String item;
    private double amount;

    public Food(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }
}
