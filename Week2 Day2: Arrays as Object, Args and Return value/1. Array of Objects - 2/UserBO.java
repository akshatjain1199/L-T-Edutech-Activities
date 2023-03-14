import java.util.Arrays;
import java.util.Comparator;

public class UserBO {
public void displayAll(User[] users) {
    System.out.println("User Details:");
    int count = 0;
    for (int i = 0; i < users.length; i++) {
        if (users[i] != null) {
            count++;
            System.out.println("User " + count);
            System.out.println(users[i].toString());
        }
    }
}


    public void sortUsers(User[] users) {
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getName().compareTo(u2.getName());
            }
        });
    }

    public Boolean deleteUser(User[] users, String nameToDelete) {
    for (int i = 0; i < users.length; i++) {
        if (users[i].getName().equals(nameToDelete)) {
            users[i] = null;
            for (int j = i; j < users.length - 1; j++) {
                users[j] = users[j + 1];
            }
            users[users.length - 1] = null;
            return true;
        }
    }
    return false;
}
}
