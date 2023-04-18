
import java.sql.*;
import java.io.*;
import java.util.*;

public class UserDAO {
	 Connection con=null;
	public User getUser(String username)throws Exception{
		
		//write your code here
		User tempUser=null;
		String search="select * from user where username=?";
		con=DbConnection.getConnection();
		try{
			PreparedStatement searchStatement=con.prepareStatement(search);
			searchStatement.setString(1,username);
			ResultSet rsUser=searchStatement.executeQuery();
			while(rsUser.next()){
				tempUser=new User(rsUser.getLong(1),rsUser.getString(2),rsUser.getString(3),rsUser.getString(4),rsUser.getString(5));
			}
			searchStatement.close();
		}catch(Exception exUser){
			System.out.println(exUser);
			exUser.printStackTrace();
		}
		con.close();
		return tempUser;
	}
}
