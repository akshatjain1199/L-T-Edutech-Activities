
import java.sql.*;
import java.io.*;
import java.util.*;

public class HallDAO{

    Connection con1=null;
    public void saveHall(Hall hall) throws Exception{
        con1=DbConnection.getConnection();
        String insertQuery="insert into hall(id,name,contact_detail,cost_per_day,owner_id) values (?,?,?,?,?)";
        try{
            PreparedStatement insertStatement=con1.prepareStatement(insertQuery);
            insertStatement.setLong(1,hall.getId());
            insertStatement.setString(2,hall.getName());
            insertStatement.setString(3,hall.getContactNumber());
            insertStatement.setDouble(4,hall.getCostPerDay());
            insertStatement.setLong(5,hall.getOwner().getId());
            int count =insertStatement.executeUpdate();
            insertStatement.close();
        }
        catch(Exception exHall1){
            System.out.println(exHall1);
            exHall1.printStackTrace();
        }
        con1.close();
    }

    public List<Hall>getAllHall()throws Exception{
        List<Hall>tempList=new ArrayList<>();
        con1=DbConnection.getConnection();
        String display="select * from hall h inner join user us on h.owner_id=us.id order by h.id asc";
        try{
            Statement resultStatement=con1.createStatement();
            ResultSet resultDisplay=resultStatement.executeQuery(display);
            while(resultDisplay.next()){
                tempList.add(new Hall(resultDisplay.getLong(1),resultDisplay.getString(2),resultDisplay.getString(3),resultDisplay.getDouble(4),new User(resultDisplay.getLong(6),resultDisplay.getString(7),resultDisplay.getString(8),resultDisplay.getString(9),resultDisplay.getString(10))));
            }
            resultStatement.close();
        }
        catch(Exception exHall2){
            System.out.println(exHall2);
            exHall2.printStackTrace();
        }
        con1.close();
        return tempList;
    }
    public long generateHallId()throws Exception{
        con1=DbConnection.getConnection();
        String sql="select count(id) from hall";
        long tempIdCount=0;
        try{
            Statement s=con1.createStatement();
            ResultSet r=s.executeQuery(sql);
            r.next();
            tempIdCount=r.getLong(1);
            s.close();
        }
        catch(Exception exHall3){
            System.out.println(exHall3);
            exHall3.printStackTrace();
        }
        con1.close();
        return tempIdCount;
    }

}
