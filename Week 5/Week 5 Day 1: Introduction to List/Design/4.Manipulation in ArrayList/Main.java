import java.util.*;
import java.io.*;
public class Main {
	public static void main(String args[]) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HallBO h_obj = new HallBO();
		List<Hall> halls = h_obj.getHallList();
		boolean flag = true; 
		while(flag){
			System.out.println("Enter an option:");
			System.out.println("1.Add \n2.Replace \n3.Display \n4.Exit");
			int choice = Integer.parseInt(reader.readLine());
			
			switch(choice){
				case 1:
				System.out.println("Enter the name of the hall:");
			    String h_name = reader.readLine();
			    System.out.println("Enter the contact number of the hall:");
			    String h_number = reader.readLine();
			    System.out.println("Enter the cost per day of the hall:");
			    double h_cost = Double.parseDouble(reader.readLine());
			    System.out.println("Enter the owner name of the hall:");
	            String h_owner = reader.readLine();
			    Hall obj = new Hall(h_name,h_number,h_cost,h_owner);
			    halls.add(obj);
			    System.out.println("Hall added successfully");
	            break;
				
				case 2:
			    System.out.println("Enter the hall number which should be replaced:");
			    int r_hall =  Integer.parseInt(reader.readLine());;
			    System.out.println("Enter the name of the replacement hall:");
			    String r_name = reader.readLine();
			    System.out.println("Enter the contact number of the replacement hall:");
			    String r_number = reader.readLine();
			    System.out.println("Enter the cost per day of the replacement hall:");
			    double r_cost = Double.parseDouble(reader.readLine());
			    System.out.println("Enter the owner name of the replacement hall:");
			    String r_owner = reader.readLine();
			    Hall new_obj = new Hall(r_name, r_number, r_cost, r_owner);
			    halls.set(r_hall - 1, new_obj);
			    System.out.println("Hall replaced successfully");
			    break;
				
				case 3:
		        h_obj.displayAll(halls);
			    break;

				case 4:
				System.out.println("Exiting Application");
				flag = false; 
				break;
		}
		}
	}
}
