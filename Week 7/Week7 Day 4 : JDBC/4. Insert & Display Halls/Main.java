import java.io.*;
import java.lang.*;
import java.util.*;
import java.sql.*;
public class Main {
	public static void main(String args[]) throws Exception {
		try{//write your code here
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(r);
		List<Hall>hallList=new ArrayList<>();
		User newUser;
		System.out.println("Enter the details of hall in csv format:");
		String input=br.readLine();
		String [] details=input.split(",");
		System.out.println("Enter the username:");
		while(true){
		String uname=br.readLine();
		UserDAO uDAO=new UserDAO();
		 newUser=uDAO.getUser(uname);
		if(newUser!=null){
			break;
		}
		System.out.println("Username seems to be wrong!! Enter the correct username:");
		}
		HallDAO hDAO=new HallDAO();
		long h_id=hDAO.generateHallId();
		h_id=h_id+1;
		
		Hall newHall=new Hall(details[0],details[1],Double.parseDouble(details[2]),newUser);
		newHall.setId(h_id);
		hDAO.saveHall(newHall);
		hallList=hDAO.getAllHall();
		System.out.println("The hall details are:");
		System.out.printf("%-15s%-15s%-15s%-15s\n","Name","Mobile","Cost","Owner");
		for(Hall htemp:hallList){
			System.out.println(htemp);
		}
		}
		catch(Exception ex){
			System.out.println(ex);
			ex.printStackTrace();
		}
	}
}
