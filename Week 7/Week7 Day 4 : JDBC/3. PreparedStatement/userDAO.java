import java.sql.*;
import java.util.*;

public class UserDAO {

	public void insertDetails(User u) throws Exception{
		String q3 = "insert into user (name, contact_detail, username, password) values (?, ?, ?, ?)";
		Connection c = DbConnection.getConnection();
		PreparedStatement pst = c.prepareStatement(q3, Statement.RETURN_GENERATED_KEYS);
		//pst.setLong(1, u.getId());
		pst.setString(1, u.getName());
		pst.setString(2, u.getContactDetail());
		pst.setString(3, u.getUsername());
		pst.setString(4, u.getPassword());

		int count = pst.executeUpdate();
        pst.close();
        c.close();
	}
	public List<User> getAllUser() throws Exception {
		//your code goes here...
        List<User> al=new ArrayList<>();
		String q = "select * from user";
        Connection con = DbConnection.getConnection();
		PreparedStatement st = con.prepareStatement(q);

		ResultSet rs = st.executeQuery(q);
		while(rs.next()){
			long id = rs.getLong("id");
			String name = rs.getString("name");
			String cd = rs.getString("contact_detail");
			String un = rs.getString("username");
			String pwd = rs.getString("password");
            User u = new User(name, cd, un, pwd);
            u.setId(id);
  
			al.add(u);
		}

		st.close();
		con.close();

		return al;
	}
}


