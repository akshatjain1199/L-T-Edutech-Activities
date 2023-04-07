import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Expense> expenses = new TreeSet<>();

        while (true) {
            System.out.println("Enter expense category");
            String expenseCategory = sc.next();

            System.out.println("Enter expense amount");
            int amount = sc.nextInt();

            expenses.add(new Expense(expenseCategory, amount));

            System.out.println("Do you want to continue (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Top spending categories");
        System.out.println(String.format("%-15s%-15s", "Category", "Amount"));

        int totalAmount = 0;

        for (Expense expense : expenses) {
            System.out.println(String.format("%-15s%-15s", expense.getExpenseCategory(), expense.getAmount()));
            totalAmount += expense.getAmount();
        }

        System.out.println("Total amount spent: " + totalAmount);
    }
}
class Expense implements Comparable<Expense> {
    private String expenseCategory;
    private int amount;

    public Expense(String expenseCategory, int amount) {
        this.expenseCategory = expenseCategory;
        this.amount = amount;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Expense o) {
        return o.getAmount() - this.amount;
    }
}
