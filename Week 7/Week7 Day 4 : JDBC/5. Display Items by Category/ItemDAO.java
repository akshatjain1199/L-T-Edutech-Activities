import java.lang.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class ItemDAO {
	Connection con2=null;
	public List<Item> findItemsByCategory(String category)throws Exception{
		//your code goes here...
		List<Item> itemList=new ArrayList<>();
		con2=DbConnection.getConnection();
		String search="select * from item i inner join item_type it on i.type_id=it.id where it.name=?";
		try{
			PreparedStatement searchStatement=con2.prepareStatement(search);
			searchStatement.setString(1,category);
			ResultSet itemSet=searchStatement.executeQuery();
			while(itemSet.next()){
				itemList.add(new Item(itemSet.getLong(1),itemSet.getString(2),new ItemType(itemSet.getLong(5),itemSet.getString(6),itemSet.getDouble(7),itemSet.getDouble(8)),itemSet.getString(3)));
			}
			searchStatement.close();
		}
		catch(Exception ex2){
			System.out.println(ex2);
			ex2.printStackTrace();
		}
		con2.close();
		return itemList;
		
		
	}
}
