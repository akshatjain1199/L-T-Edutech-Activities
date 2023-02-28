import java.util.Scanner;

public class Week1Day5_StringBasics_3_ToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String str = sc.nextLine().trim();

        System.out.println("Name:" + str.toUpperCase());
    }
}
