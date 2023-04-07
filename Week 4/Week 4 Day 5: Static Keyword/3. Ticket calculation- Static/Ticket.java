public class Ticket {
     
       private int ticketid;
       private int price;
       private static int totalnooftickets;
       public void setTicketid(int ticketid)
       {
           this.ticketid = ticketid;
       }
       public int getTicketid()
       {
           return ticketid;
       }
       public void setPrice(int price)
       {
           this.price = price;
       }
       public int getPrice()
       {
           return price;
       }
       public static void setTotalnooftickets(int a)
       {
           totalnooftickets = a;
       }
       public int getTotalnooftickets()
       {
           return totalnooftickets;
       }
       public int Calculatetotalamount(int nooftickets)
       {
           if(nooftickets<= totalnooftickets)
           {  
               totalnooftickets = totalnooftickets-nooftickets;
               return (price*nooftickets);
           }
           else{
               return -1;
           }
       }  
}
