import java.lang.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class ItemTypeDAO {
	public List<ItemType> getAllItemTypes()throws Exception{
		//your code goes here...
		List<ItemType>itemTypeList=new ArrayList<>();
		Connection con1=null;
		String displayAll="select * from item_type";
		try{
			con1=DbConnection.getConnection();
			Statement displayAllStatement=con1.createStatement();
			ResultSet typeSet=displayAllStatement.executeQuery(displayAll);
			while(typeSet.next()){
				itemTypeList.add(new ItemType(typeSet.getLong(1),typeSet.getString(2),typeSet.getDouble(3),typeSet.getDouble(4)));
			}
			displayAllStatement.close();
		}catch(Exception ex1){
			System.out.println(ex1);
			ex1.printStackTrace();
		}
		con1.close();
		return itemTypeList;
	}

}
