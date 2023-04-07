import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of colleges");
        int n = in.nextInt();
        LinkedHashSet<String> colleges = new LinkedHashSet<String>();
        System.out.println("Enter the college details one by one");
        in.nextLine(); 
        for (int i = 0; i < n; i++) {
            String detail = in.nextLine();
            colleges.add(detail);
        }
        System.out.println("Enter number of colleges to be displayed");
        int num = in.nextInt();
        if (num > colleges.size()) {
            System.out.println("Invalid");
        } else {
            Iterator<String> iter = colleges.iterator();
            System.out.println("First " + num + " college details");
            for (int i = 0; i < num; i++) {
                String detail = iter.next();
                System.out.println(detail);
            }
            in.nextLine();
            System.out.println("Enter the collage code to search :");
            String code = in.nextLine();
            boolean found = false;
            for (String detail : colleges) {
                String[] parts = detail.split("-");
                if (parts[0].equals(code)) {
                    System.out.println("Entered college code is found");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Entered college code is not found");
            }
        }
    }
}
