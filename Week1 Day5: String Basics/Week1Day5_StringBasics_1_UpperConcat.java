import java.util.Scanner;

public class Week1Day5_StringBasics_1_UpperConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println("The length of the first string is " + str1.length());
        System.out.println("The length of the second string is " + str2.length());
        System.out.println("The uppercase of the first string is " + str1.toUpperCase());
        System.out.println("The uppercase of the second string is " + str2.toUpperCase());
        System.out.println("The concatenated string is " + str1.concat(str2));

        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Both the input strings are the same");
        } else if (result < 0) {
            System.out.println(str1 + " appears before " + str2);
        } else {
            System.out.println(str2 + " appears before " + str1);
        }
    }
}
