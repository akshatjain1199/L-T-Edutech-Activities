
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Set<String> emailAddresses = new HashSet<>();
        String details;

        while (true) {
            System.out.println("Enter Email address");
            details = scn.nextLine().trim();
            emailAddresses.add(details);

            System.out.println("Do you want to Continue?(yes/no)");
            details = scn.nextLine().trim().toLowerCase();

            if (!details.equals("yes")) {
                break;
            }
        }

        System.out.println("Enter the email addresses to be searched separated by comma");
        details = scn.nextLine().trim();
        List<String> searchEmails = Arrays.asList(details.split(","));
        Set<String> searchEmailsSet = new HashSet<>(searchEmails);

        if (emailAddresses.containsAll(searchEmailsSet)) {
            System.out.println("Email addresses are present");
        } else {
            System.out.println("Email addresses are not present");
        }
    }
}
