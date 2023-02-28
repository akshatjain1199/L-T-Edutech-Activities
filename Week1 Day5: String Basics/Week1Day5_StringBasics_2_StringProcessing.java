import java.util.Scanner;

public class Week1Day5_StringBasics_2_StringProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string");
        String str = sc.nextLine().trim();
        System.out.println("The processed string is " + str.split(" ")[0] + str.substring(str.split(" ")[0].length()).toUpperCase());
    }
}
