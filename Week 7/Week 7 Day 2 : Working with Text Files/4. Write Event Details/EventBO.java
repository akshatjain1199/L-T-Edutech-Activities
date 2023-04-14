import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EventBO {
    public void saveToFile(List<Event> eventList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("event.txt"))) {
            writer.write("Event details:");
            writer.newLine();

            for (Event event : eventList) {
                String eventDetails = event.getName() + "," + event.getDetails() + "," + event.getManager();
                writer.write(eventDetails);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
