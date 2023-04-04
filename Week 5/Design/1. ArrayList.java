import java.util.ArrayList;
import java.util.*;
public class Main {
	public static void main(String args[]) {
	ArrayList<String> username= new ArrayList<>();
	Scanner scn= new Scanner(System.in);
	String choice="y";
	while (choice.equals("y")) {
		System.out.println("Enter the username "+(username.size() + 1));
		String name= scn.nextLine();
		username.add(name);
	System.out.println("Do you want to continue?(y/n)");
	choice=scn.nextLine().toLowerCase();
	 while (!choice.equals("y") && !choice.equals("n")) {
                System.out.println("Invalid choice. Please enter y or n.");
                choice = scn.nextLine().toLowerCase();
	}
}
	System.out.println("The Names entered are:");
	for(String name: username){
		System.out.println(name);
	}
}
}
