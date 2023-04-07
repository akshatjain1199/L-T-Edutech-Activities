import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> usernames = new HashSet<>();

        while (true) {
            System.out.println("Enter the username");
            String username = scanner.nextLine();
            usernames.add(username);

            System.out.println("Do you want to continue? (Y/N)");
            char continueChoice = scanner.nextLine().charAt(0);

            if (continueChoice == 'N' || continueChoice == 'n') {
                break;
            }
        }

        System.out.println("The unique number of usernames is " + usernames.size());
    }
}
