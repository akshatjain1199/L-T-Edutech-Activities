import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Wicket> wicketsMap = new HashMap<String, Wicket>();
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("Enter the player name");
            String playerName = scanner.nextLine();
            System.out.println("Enter wickets - seperated by \"|\" symbol");
            String[] wickets = scanner.nextLine().split("\\|");
            Bowler bowler = new Bowler(playerName);
            Wicket wicket = new Wicket(String.join(",", wickets), bowler);
            wicketsMap.put(playerName, wicket);
            System.out.println("Do you want to add another player (yes/no)");
            choice = scanner.nextLine();
        }
        choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("Enter the player name to search");
            String playerName = scanner.nextLine();
            if (wicketsMap.containsKey(playerName)) {
                System.out.println("Player Name : " + playerName);
                System.out.println("Wickets :");
                String[] wickets = wicketsMap.get(playerName).getDescription().split(",");
                for (String wicket : wickets) {
                    System.out.println(wicket.trim());
                }
            } else {
                System.out.println("No player found with the name " + playerName);
            }
            System.out.println("Do you want to search another player (yes/no)");
            choice = scanner.nextLine();
        }
        scanner.close();
    }
}
class Bowler {
    private String name;

    public Bowler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Wicket {
    private String description;
    private Bowler bowler;

    public Wicket(String description, Bowler bowler) {
        this.description = description;
        this.bowler = bowler;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Bowler getBowler() {
        return bowler;
    }

    public void setBowler(Bowler bowler) {
        this.bowler = bowler;
    }
}
