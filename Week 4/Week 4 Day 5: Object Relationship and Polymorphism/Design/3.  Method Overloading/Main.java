import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Booking details");
        String[] bookingDetails = sc.nextLine().split(",");
        TicketBooking ticket = new TicketBooking(bookingDetails[0], bookingDetails[1], Integer.parseInt(bookingDetails[2]));
        System.out.println("Payment mode");
        System.out.println("1.Cash payment");
        System.out.println("2.Wallet payment");
        System.out.println("3.Credit card payment");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the amount");
                double amount = sc.nextDouble();
                ticket.makePayment(amount);
                break;
            case 2:
                System.out.println("Enter the amount");
                double walletAmount = sc.nextDouble();
                System.out.println("Enter the wallet number");
                String walletNumber = sc.next();
                ticket.makePayment(walletNumber, walletAmount);
                break;
            case 3:
                System.out.println("Enter cardholder name");
                String name = sc.next();
                System.out.println("Enter the amount");
                double ccAmount = sc.nextDouble();
                System.out.println("Enter the credit card type");
                String creditCard = sc.next();
                System.out.println("Enter the CCV number");
                String ccv = sc.next();
                ticket.makePayment(creditCard, ccv, name, ccAmount);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
