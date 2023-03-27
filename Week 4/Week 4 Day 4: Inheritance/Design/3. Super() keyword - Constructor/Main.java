import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Choose Event type");
        System.out.println("1. Exhibition");
        System.out.println("2. StageEvent");
        int choice;
        try {
            choice = Integer.parseInt(scn.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice");
            return;
        }

        switch (choice) {
            case 1:
                System.out.println("Enter the details in CSV format");
                String[] exhibitionDetails = scn.nextLine().split(",");
                String name = exhibitionDetails[0];
                String detail = exhibitionDetails[1];
                String type = exhibitionDetails[2];
                String organiserName = exhibitionDetails[3];
                int noOfStalls = Integer.parseInt(exhibitionDetails[4]);
                Exhibition exhibition = new Exhibition(name, detail, type, organiserName, noOfStalls);
                System.out.println("Event Name: " + exhibition.getName());
                System.out.println("Detail: " + exhibition.getDetail());
                System.out.println("Type: " + exhibition.getType());
                System.out.println("Organiser Name: " + exhibition.getOrganiserName());
                System.out.println("Number of stalls: " + exhibition.getNoOfStalls());
                break;
            case 2:
                System.out.println("Enter the details in CSV format");
                String[] stageEventDetails = scn.nextLine().split(",");
                name = stageEventDetails[0];
                detail = stageEventDetails[1];
                type = stageEventDetails[2];
                organiserName = stageEventDetails[3];
                int noOfSeats = Integer.parseInt(stageEventDetails[4]);
                StageEvent stageEvent = new StageEvent(name, detail, type, organiserName, noOfSeats);
                System.out.println("Event Name: " + stageEvent.getName());
                System.out.println("Detail: " + stageEvent.getDetail());
                System.out.println("Type: " + stageEvent.getType());
                System.out.println("Organiser Name: " + stageEvent.getOrganiserName());
                System.out.println("Number of seats: " + stageEvent.getNoOfSeats());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
