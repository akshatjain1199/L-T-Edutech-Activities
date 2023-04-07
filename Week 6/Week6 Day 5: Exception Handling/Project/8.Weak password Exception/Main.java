import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the user details");
        
        String details[]=sc.nextLine().split(",");
        String name = details[0];
        String mobile =  details[1];
        String username =  details[2];
        String password =  details[3];

        
        User user = new User(name, mobile, username, password);

        try {
            
            UserBO.validate(user);
            
            System.out.println(user);
        } catch (WeakPasswordException e) {
        
            System.out.println(e);
        }
    }
}
