import java.lang.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Main {
	public static void main(String args[])throws Exception{
		try{//your code goes here...
		List<ItemType>itList=new ArrayList<>();
		List<Item>iList=new ArrayList<>();
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		ItemTypeDAO itDAO=new ItemTypeDAO();
		itList=itDAO.getAllItemTypes();
		System.out.printf("%-5s %-15s %-12s %s\n","ID","Name","Deposit","Cost per day");
		for(ItemType i1:itList){
			System.out.print(i1.toString());
		}
		System.out.println("Enter the category:");
		String cat=br.readLine();
		ItemDAO iDAO=new ItemDAO();
		iList=iDAO.findItemsByCategory(cat);
		if(iList.isEmpty()){
			System.out.println("No such category is present");
		}
		else{
			System.out.printf("%-5s %-15s %-12s %s\n","ID","Name","Item Type","Vendor");
			for(Item i2:iList){
				System.out.print(i2.toString());
			}
		}
		}
		catch(Exception ex3){
			System.out.println(ex3);
			ex3.printStackTrace();
		}
	}
}
