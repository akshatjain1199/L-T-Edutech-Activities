import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of objects:");
		int n = scanner.nextInt();
		System.out.println("Enter the Total no of tickets:");
		int totalnooftickets = scanner.nextInt();
		Ticket arr[] = new Ticket[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the ticketid:");
			int ticketId = scanner.nextInt();
			System.out.println("Enter the price:");
			int price = scanner.nextInt();
			System.out.println("Enter the no of tickets:");
			int nooftickets = scanner.nextInt();
			arr[i] = new Ticket();
			arr[i].setTicketid(ticketId);
			arr[i].setPrice(price);
			Ticket.setTotalnooftickets(totalnooftickets);
			System.out.println("Total no of tickets: "+Ticket.getTotalnooftickets());
			if(nooftickets>Ticket.getTotalnooftickets()) {
				System.out.println("Sorry tickets not available.");
			}else {
				System.out.println("Total amount:"+arr[i].Calculatetotalamount(nooftickets));
				System.out.println("Total no of ticket after booking:"+(Ticket.getTotalnooftickets()-nooftickets));
				totalnooftickets -= nooftickets;
			}
		}
	}

}
