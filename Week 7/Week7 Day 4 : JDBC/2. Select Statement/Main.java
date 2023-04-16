import java.util.*;
import java.sql.*;
public class Main {
    public static void main(String args[])throws ClassNotFoundException,SQLException{
        //your code goes here..
        List<User> l= new ArrayList<>();
        System.out.format("%-5s %-5s %-15s %-10s %s\n","Id","Name","Contact Detail","Username","Password");
        UserDAO ud= new UserDAO();
        l= ud.getAllUsers();
        for(User u: l){
            System.out.format("%-5s %-5s %-15s %-10s %s\n",u.getId(),u.getName(),u.getContactDetail(),u.getUsername(),u.getPassword());
        }
    }
}
