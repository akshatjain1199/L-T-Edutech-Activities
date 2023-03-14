import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter the string");
	String s= scn.nextLine();
	System.out.println("The words in the string are");
	String[] words= s.split("\\s+");
	for(int i=0;i<=words.length-1;i++){
		System.out.println(words[i]);
	}
	}
}
