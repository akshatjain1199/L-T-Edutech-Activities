import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the content of the document");
	String s= scn.nextLine();
	System.out.println("Enter the old name of the company");
	String old= scn.nextLine();
	System.out.println("Enter the new name of the company");
	String newname= scn.nextLine();
	System.out.println("The content of the modified document is");
	System.out.println(s.replaceAll(old,newname));
	}
}
