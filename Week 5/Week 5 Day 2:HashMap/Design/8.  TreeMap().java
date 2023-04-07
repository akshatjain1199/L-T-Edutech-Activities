import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of events:");
        int n = sc.nextInt();
        sc.nextLine();
        TreeMap<Integer, Integer> ticketMap = new TreeMap<>();
       System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
	    for(int i = 1; i <= n; i++) {
            
            String[] event = sc.nextLine().split(",");
            int price = Integer.parseInt(event[1]);
            int seats = Integer.parseInt(event[2]);
            ticketMap.put(price, ticketMap.getOrDefault(price, 0) + seats);
        }
        System.out.printf("%-15s %s\n", "Ticket Price", "Tickets Booked");
        for(Map.Entry<Integer, Integer> entry: ticketMap.entrySet()) {
            System.out.printf("%-15d %d\n", entry.getKey(), entry.getValue());
        }
    }
}
