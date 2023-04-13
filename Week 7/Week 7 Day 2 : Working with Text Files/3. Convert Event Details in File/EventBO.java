import java.io.FileWriter;
import java.io.IOException;

public class EventBO {
    public void saveToFile(Event event) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("event.txt");
            fileWriter.write("Event details"+"\n");
            fileWriter.write("Event name:" + event.getName() + "\n");
            fileWriter.write("Event details:" + event.getDetails() + "\n");
            fileWriter.write("Event manager:" + event.getManager() + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }
}
