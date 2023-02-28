import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        System.out.println("The length of the first string is " + s1.length());
        System.out.println("The length of the second string is " + s2.length());
        System.out.println("The uppercase of the first string is " + s1.toUpperCase());
        System.out.println("The uppercase of the second string is " + s2.toUpperCase());
        System.out.println("The concatenated string is " + s1.concat(s2));
        int result = s1.compareTo(s2);
        if (result == 0) {
            System.out.println("Both the input strings are the same");
        } else if (result < 0) {
            System.out.println(s1 + " appears before " + s2);
        } else {
            System.out.println(s2 + " appears before " + s1);
        }
    }
}
