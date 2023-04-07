import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of passengers Booked");
        int totalPassengers = scanner.nextInt();
        scanner.nextLine();

        List<String> passengers = new ArrayList<>();

        System.out.println("Enter the passenger's name who Booked");
        for (int i = 0; i < totalPassengers; i++) {
            String passengerName = scanner.nextLine();
            passengers.add(passengerName);
        }

        System.out.println("Enter the number of seats available");
        int availableSeats = scanner.nextInt();

        List<String> extraPassengers = getExtraPassengers(passengers, availableSeats);

        System.out.println("Extra Passengers list");
        System.out.println(extraPassengers);

        scanner.close();
    }

    private static List<String> getExtraPassengers(List<String> passengers, int availableSeats) {
        List<String> extraPassengers = new ArrayList<>();

        for (int i = availableSeats; i < passengers.size(); i++) {
            extraPassengers.add(passengers.get(i));
        }

        return extraPassengers;
    }
}
