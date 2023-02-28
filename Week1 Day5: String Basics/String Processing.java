import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the input string");
		String s= scn.nextLine();
		String[] split = s.trim().split("\\s+"); 
		String result = split[0];  
        for (int i = 1; i < split.length; i++) {
            result += " " + split[i].toUpperCase();  
        }

		System.out.println("The processed string is "+result);

	}
}
