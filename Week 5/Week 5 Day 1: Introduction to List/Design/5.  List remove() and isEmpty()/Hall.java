import java.util.*;
public class Hall {
    //Your code here
     String name;
     String contactNumber;
    double costPerDay;
     String ownerName;
    public Hall(String name, String contactNumber,Double costPerDay,
    String ownerName){
        this.name=name;
        this.contactNumber=contactNumber;
        this.costPerDay=costPerDay;
        this.ownerName=ownerName;
 
    }
    public Hall(){
        
    }
    public void display(ArrayList<Hall> obj){
     
 
            int i=0;
            System.out.printf("%-20s%-20s%-20s%-20s\n", "Hall name", "Contact number", "Cost per day","Owner name");
            while(i<obj.size()){
                System.out.printf("%-20s%-20s%-20.1f%-20s\n", obj.get(i).name, obj.get(i).contactNumber, obj.get(i).costPerDay,obj.get(i).ownerName);
            
                i++;
            }
        
    }
}
