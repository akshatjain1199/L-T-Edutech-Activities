import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the string");
	String s= scn.nextLine();
	System.out.println("Enter the start string");
	String start= scn.nextLine();
	if(s.startsWith(start)){
	System.out.println("\"" + s + "\" starts with \"" + start + "\"");
	}
	else{
		System.out.println("\"" + s + "\" does not start with \"" + start + "\"");
	}
}
}
