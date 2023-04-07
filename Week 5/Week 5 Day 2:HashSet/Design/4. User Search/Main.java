import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<User> users = new HashSet<>();
        int numOfUsers;

        System.out.println("Enter number of users:");
        numOfUsers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfUsers; i++) {
            System.out.println("Enter details of user" + (i + 1));
            System.out.println("Username:");
            String username = scanner.nextLine().trim();
            System.out.println("Bank name:");
            String bankname = scanner.nextLine().trim();

            users.add(new User(username, bankname));
        }

        System.out.println("Enter username(Expire in one month) seperated by comma");
        String input = scanner.nextLine().trim();
        List<String> expireUsernames = Arrays.asList(input.split(","));
        List<User> expireUsers = new ArrayList<>();

        for (String username : expireUsernames) {
            expireUsers.add(new User(username, null));
        }

        users.retainAll(expireUsers);

        System.out.println("Users going to expire within a month");
        List<User> sortedUsers = new ArrayList<>(users);
        Collections.sort(sortedUsers);
        for (int i = 0; i < sortedUsers.size(); i++) {
            User user = sortedUsers.get(i);
            System.out.println("User " + (i + 1));
            System.out.println("User Name = " + user.getUsername());
            System.out.println("Bank Name = " + user.getBankname());
        }
    }
}
