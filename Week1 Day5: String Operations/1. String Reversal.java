import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
System.out.println("Enter a string to reverse");
String s= scn.nextLine();
String reverse="";
for(int i=s.length()-1;i>=0;i--){
	reverse= reverse+s.charAt(i);
}
System.out.println("Reverse of the string is "+reverse);
	}
}
