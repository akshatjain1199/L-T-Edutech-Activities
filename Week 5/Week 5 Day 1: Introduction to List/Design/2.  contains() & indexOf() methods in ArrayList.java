import java.util.ArrayList;
import java.util.*;
public class Main {
	public static void main(String args[]) throws Exception{
	Scanner scn= new Scanner(System.in);
	ArrayList<String> hall = new ArrayList<>();
	System.out.println("Enter the number of halls:");
	int totalhalls= scn.nextInt();
	scn.nextLine();
	int i=0;
	while(i<totalhalls){
		System.out.println("Enter the Hall Name "+ (i+1));
		String hallname= scn.nextLine();
		hall.add(hallname);
		i++;
		
	}
	System.out.println("Enter the hall name to be searched:");
	String searchhall= scn.nextLine();
		if(hall.contains(searchhall)){
			int pos= hall.indexOf(searchhall);
			System.out.println(searchhall +" hall is found in the list at position "+ pos);
		}
		else{
			System.out.println(searchhall+" hall is not found");
		}
	}
}
