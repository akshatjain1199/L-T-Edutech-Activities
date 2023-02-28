import java.util.Scanner;

public class Week1Day5_StringBasics_4_ContainsTrim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text from the document");
        String str1 = sc.nextLine().trim();
        System.out.println("Enter the string to be found in the data");
        String str2 = sc.nextLine().trim();

        if (str1.contains(str2)) {
            System.out.println("String is found in the document");
        } else {
            System.out.println("String is not found in the document");
        }
    }
}
