import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> usernames = new HashSet<>();
        String input;

        while (true) {
            System.out.println("Enter Username");
            input = scanner.nextLine().trim();
            
            if (input.isEmpty()) {
                input = "null";
            }
            usernames.add(input);

            System.out.println("Do you want to continue ?(yes/no)");
            input = scanner.nextLine().trim().toLowerCase();

            if (!input.equals("yes")) {
                break;
            }
        }

        System.out.println("Number of Users = " + usernames.size());
    }
}
