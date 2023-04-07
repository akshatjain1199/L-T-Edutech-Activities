import java.util.*; 
//Fill code here 
import java.util.stream.*;
class Main
{
    public static void main(String args[]) {
        //Fill code here
        Scanner sc= new Scanner(System.in);
        ArrayList<TicketBooking> l=new ArrayList<>();
        System.out.println("Enter number of bookings");
        int n= sc.nextInt();
     
        while(n >0){
            System.out.println("Enter customer name");
            String name= sc.next();
            System.out.println("Enter number of tickets");
            Integer not= sc.nextInt();
            System.out.println("Enter the price");
            Double p= sc.nextDouble();
            l.add(new TicketBooking(name,not,p));
            n--;
        }
        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        l.stream().sorted(Comparator.comparing(TicketBooking::getPrice)).forEach(System.out::println);
    }
}
