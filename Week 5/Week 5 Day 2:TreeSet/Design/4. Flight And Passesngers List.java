import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPassengers = sc.nextInt();

        TreeMap<String, TreeSet<String>> flights = new TreeMap<>();

        for (int i = 0; i < numPassengers; i++) {
            String input = sc.next();
            String[] parts = input.split("\\|");
            String flightName = parts[0];
            String passengerName = parts[1];

            TreeSet<String> passengers = flights.getOrDefault(flightName, new TreeSet<>());
            passengers.add(passengerName);
            flights.put(flightName, passengers);
        }

        System.out.println("Flights and Passengers in ascending order");

        for (String flightName : flights.keySet()) {
            System.out.println(flightName);

            TreeSet<String> passengers = flights.get(flightName);

            for (String passengerName : passengers) {
                System.out.println("--" + passengerName);
            }
        }
    }
}
