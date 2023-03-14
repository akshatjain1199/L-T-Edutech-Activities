import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int numUsers = scanner.nextInt();
        scanner.nextLine();
        UserBO userBO = new UserBO();
        User[] userArray = new User[numUsers];
        for (int i = 0; i < numUsers; i++) {
            System.out.println("Enter the details of User " + (i+1));
            System.out.println("Enter the name of the user:");
            String name = scanner.nextLine();
            System.out.println("Enter the mobile number of the user:");
            String mobileNumber = scanner.nextLine();
            System.out.println("Enter the username of the user:");
            String username = scanner.nextLine();
            System.out.println("Enter the password of the user:");
            String password = scanner.nextLine();
            User user = new User(name, mobileNumber, username, password);
            userArray[i] = user;
        }
        System.out.println("User details as entered:");
        userBO.displayAll(userArray);
        userBO.sortUsers(userArray);
        System.out.println("After sorting:");
        userBO.displayAll(userArray);
        System.out.println("Enter the user to be deleted:");
        String nameToDelete = scanner.nextLine();
        Boolean isDeleted = userBO.deleteUser(userArray, nameToDelete);
        if (isDeleted) {
            System.out.println("User deleted successfully");
            System.out.println("After Deleting:");
            userBO.displayAll(userArray);
        } else {
            System.out.println("No user found with given name");
        }
    }
}
