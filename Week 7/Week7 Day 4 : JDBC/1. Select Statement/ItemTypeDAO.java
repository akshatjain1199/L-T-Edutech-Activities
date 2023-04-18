import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class ItemTypeDAO {
	public List<ItemType> getAllItemTypes() {
		//your code goes here...
         List<ItemType> al = new ArrayList<>();
       
        String query = "select * from item_type";
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                double deposit = resultSet.getDouble("deposit");
                double costPerDay = resultSet.getDouble("cost_per_day");
                ItemType itemType = new ItemType(id, name, deposit, costPerDay);
                al.add(itemType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
       
        return al;
    }
		
}
