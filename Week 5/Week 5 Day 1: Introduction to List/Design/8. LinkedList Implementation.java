import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of participants to be registered : ");
        int numberOfParticipants = scanner.nextInt();
        scanner.nextLine();

        LinkedList<String> participants = new LinkedList<>();

        System.out.println("Enter the participants details");
        for (int i = 0; i < numberOfParticipants; i++) {
            String participantDetails = scanner.nextLine();
            participants.add(participantDetails);
        }

        LinkedList<String> validParticipants = findValidParticipants(participants);

        if (validParticipants.isEmpty()) {
            System.out.println("No valid participants");
        } else {
            System.out.println("List of valid participants");
            for (String validParticipant : validParticipants) {
                System.out.println(validParticipant);
            }
        }
    }

    private static LinkedList<String> findValidParticipants(LinkedList<String> participants) {
        LinkedList<String> validParticipants = new LinkedList<>();

        for (String participant : participants) {
            String[] details = participant.split("_");

            if (details.length == 3 && (details[1].equals("IT") || details[1].equals("CSE") || details[1].equals("ECE")) && details[2].length() == 7) {
                validParticipants.add(participant);
            }
        }

        return validParticipants;
    }
}
