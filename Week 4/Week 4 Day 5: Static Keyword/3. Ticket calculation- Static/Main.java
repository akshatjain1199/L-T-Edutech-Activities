import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[]args) throws Exception
    { 
     Scanner sc =new Scanner(System.in);
     Ticket t = new Ticket();
     System.out.println("Enter no of objects:");
     int n = sc.nextInt();
     System.out.println("Enter the Total no of tickets:");
     int a = sc.nextInt();
     while(n>0)
     {
     System.out.println("Enter the ticketid:");
     int b = sc.nextInt();
     System.out.println("Enter the price:");
     int c = sc.nextInt();
     System.out.println("Enter the no of tickets:");
     int d = sc.nextInt();
     if(t.getTotalnooftickets()>0)
     {
         a =t.getTotalnooftickets();
     }
     t.setTicketid(b);
     t.setPrice(c);
     t.setTotalnooftickets(a);
     System.out.println("Total no of tickets: "+t.getTotalnooftickets());
     int e = t.Calculatetotalamount(d);
     if(e<0)
     {
         System.out.println("Sorry tickets not available.");
     }
     else
     {
         System.out.println("Total amount:"+e);
         System.out.println("Total no of ticket after booking:"+t.getTotalnooftickets());
     }
     n--;
     }
    }
}
