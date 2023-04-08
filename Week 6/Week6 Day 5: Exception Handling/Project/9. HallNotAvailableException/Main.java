import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		
		ArrayList<Event> eventList=new ArrayList<>();
		ArrayList<Hall> hallList=new ArrayList<>();
		
		eventList.add(new Event("Book Fair","All books available","John","Exhibition"));
		eventList.add(new Event("Furniture Fair","Discount of 20%","Joe","Exhibition"));
		eventList.add(new Event("Magic show","Magic without Logic","Jack","Stage event"));
		
		hallList.add(new Hall("Sdf hall","123456",10000.0,"Jill"));
		hallList.add(new Hall("JKL hall","135790",25000.0,"James"));
		hallList.add(new Hall("TUV hall","246800",15000.0,"Jane"));
		
		//write your code here
        List<HallBooking> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        do{
            System.out.println("Enter the booking details:");
            String[] str = sc.nextLine().split(",");
            try {
                boolean valid1 = validateHallandEvent(str[0], str[1], eventList, hallList);
                Hall h1 = new Hall(str[0]);
                Event e1 = new Event(str[1]);
                Date d = df.parse(str[2]);
                HallBooking ob =new HallBooking(h1, e1, d, Double.parseDouble(str[3]));
                boolean valid2= HallBookingBO.validateHallBooking(list, ob);
                list.add(ob);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            System.out.println("Do you want to continue?(y/n)");
            String ch = sc.nextLine();
            if(ch.equals("n")){
                break;
            }
        }while(true);
        System.out.println("The bookings entered are:");
        System.out.printf( "%-15s%-15s%-15s%-15s\n","Hall name","Event name","Event date","Price");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
	}

    public static boolean validateHallandEvent(String hall,String event,ArrayList<Event> eventList,ArrayList<Hall>hallList)throws HallNotAvailableException{
        for(Hall ele1 : hallList){
            if(ele1.getName().equals(hall)){
                for(Event ele2 : eventList){
                    if(ele2.getName().equals(event)){
                        return true;
                    }
                }
            }
        }
        throw new HallNotAvailableException("Hall or Event does not exist");
    }
}
