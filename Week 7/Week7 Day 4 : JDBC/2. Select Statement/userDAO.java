import java.util.*;
import java.sql.*;
public class UserDAO {
    public List<User> getAllUsers() throws ClassNotFoundException, SQLException{
        //your code goes here...
        List<User> l= new ArrayList<User>();
        Connection con= DbConnection.getConnection();
        String query= "SELECT * FROM user;";
        PreparedStatement st= con.prepareStatement(query);
        ResultSet rs= st.executeQuery();
        while(rs.next()){
            l.add(new User(rs.getLong("id"),rs.getString("name"),rs.getString("contact_detail"),rs.getString("username"),rs.getString("password")));
        }
        return l;
    }
}



