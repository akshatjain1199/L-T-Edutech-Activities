import java.util.*;
public class Main {

    public static void main(String[] args) {
        // your code here

        Scanner sc = new Scanner(System.in);

        LinkedList<Flight> flights = new LinkedList<>();

        while(true){
            
            System.out.println("1.Schedule Flight\n" +
                "2.change status\n" +
                "3.Display\n" +
                "4.Exit" );

            int choice = Integer.parseInt(sc.nextLine());
            //int choice = sc.nextInt();

            if (choice == 1){
                int serial = 1;

                while(true){
                    System.out.println("Enter the flights details :" + serial);

                    System.out.println("Enter the flight name:");
                    String name = sc.nextLine();

                    System.out.println("Enter the flight number:");
                    String number = sc.nextLine();

                    System.out.println("Enter the Status:");
                    String stat = sc.nextLine();

                    flights.addLast(new Flight(name, number, stat));

                    System.out.println("Do you want to add more flight(Yes/No):");
                    String response = sc.nextLine();
                    response = response.toLowerCase();

                    if(response.equals("no"))
                        break;

                    serial += 1;
                }
            }
            else if(choice == 2){
                while(true){
                    System.out.println("Enter the flight number:");
                    String flightNum = sc.nextLine();
                    
                    System.out.println("Enter the new status:");
                    String stat = sc.nextLine();
           for(Flight flight : flights){
                        String match = flight.getFlightNumber();
                        if(match.equals(flightNum)){
                             flight.setStatus(stat);
                            break;
                        }
                    }

                    System.out.println("Do you want to change status(Yes/No):");

                    String response = sc.nextLine();
                    response = response.toLowerCase();

                    if(response.equals("no"))
                        break;
                 }
            }
            else if(choice == 3){
                System.out.println("Flight Status");

                for(Flight flight : flights){
                    System.out.println(flight.getFlightNumber() + "\n" + flight.getStatus());
                }
            }
            else if(choice == 4){
                System.out.println("You are logged-out");
                break;
            }

            System.out.println("Do you want to continue");
            String trash  = sc.nextLine();

            if(trash.equals("No"))
                break;
        }
    }
}

class Flight {
    String airline;
    String flightNumber;
    String status;

    public static final Scanner sc = new Scanner(System.in);

    public Flight(String airline, String flightNumber, String status) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

}
