import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Address 1:");
        String s1 = scn.nextLine();
        System.out.println("Address 2:");
        String s2 = scn.nextLine();
        if (s1.equals(s2)) {
            System.out.println("RED");
        } else if (s1.equalsIgnoreCase(s2)) {
            System.out.println("BLUE");
        } else if (s1.replaceAll("\\s+", "").equals(s2.replaceAll("\\s+", ""))) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");
        }
    }
}
