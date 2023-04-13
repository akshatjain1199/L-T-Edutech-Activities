import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StallBO {
    public Stall readStallFromFile() {
        String fileName = "input.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] values = line.split(",");
            Stall stall = new Stall(values[0], values[1], values[2]);
            return stall;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void display(Stall stall) {
        System.out.println("Name: " + stall.getName());
        System.out.println("Category: " + stall.getCategory());
        System.out.println("Owner: " + stall.getOwner());
    }
}
