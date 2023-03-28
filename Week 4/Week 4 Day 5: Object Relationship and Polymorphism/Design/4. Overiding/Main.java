import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read event details from user
        System.out.println("Enter the name of the event:");
        String name = sc.nextLine();
        System.out.println("Enter the detail of the event:");
        String detail = sc.nextLine();
        System.out.println("Enter the owner name of the event:");
        String ownerName = sc.nextLine();

        // read type of event from user
        System.out.println("Enter the type of the event:");
        System.out.println("1.Exhibition\n2.StageEvent");
        int eventType = sc.nextInt();

        // create object of the corresponding event class
        Event event;
        if (eventType == 1) {
            System.out.println("Enter the number of stalls:");
            int noOfStalls = sc.nextInt();
            event = new Exhibition(name, detail, ownerName, noOfStalls);
        } else if (eventType == 2) {
            System.out.println("Enter the number of shows:");
            int noOfShows = sc.nextInt();
            System.out.println("Enter the number of seats per show:");
            int noOfSeatsPerShow = sc.nextInt();
            event = new StageEvent(name, detail, ownerName, noOfShows, noOfSeatsPerShow);
        } else {
            System.out.println("Invalid event type.");
            return;
        }

        // display projected revenue
        double revenue = event.projectedRevenue();
        System.out.printf("The projected revenue of the event is %.1f", revenue);
    }
}
