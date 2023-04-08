import java.util.ArrayList;
import java.util.*;

public class Main {
	public static void main(String args[]) throws EventTypeDoesNotExistsException{
		
		ArrayList<EventType> typeList=new ArrayList<>();
		typeList.add(new EventType("Stage Event",new Long(1)));
		typeList.add(new EventType("Exhibition",new Long(2)));
		typeList.add(new EventType("Sports meet",new Long(3)));
		
		//write your code here
List<Event> list=new ArrayList<>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of the events:");
int n=Integer.parseInt(sc.nextLine());

for(int i=1;i<=n;i++)
{
	System.out.println("Enter the details of event "+i);
	String a[]=sc.nextLine().split(",");
	long id=Long.parseLong(a[3]);
		 

	while(true)
	{
	try
	{
	  if(isValid(id,typeList))
	  {
		  
		  list.add(new Event(a[0],a[1]  ,a[2]    ,id                                 ));
		  break;
	  }
else
{
	throw new EventTypeDoesNotExistsException("No event type available with the given id");
}
	}

	catch(EventTypeDoesNotExistsException e)
	{
		System.out.println(e);
		System.out.println("Enter the correct event type id:");
		id=Long.parseLong(sc.nextLine());
		 
		}
	}
}

System.out.println("The events entered are:");
System.out.format("%-15s%-15s%-15s%-15s\n","Name","Details","Owner name","Event typeid");
for(Event e: list)
{
	System.out.println(e);
}
}
	public static Boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException {
        //write your code here
		String id=Long.toString(typeId);
     for(EventType e: typeList)
	 {
		 String s=Long.toString(e.getId());
		 if(s.equals(id))
		 return true;
	 }
	return false;
	
    }
}
