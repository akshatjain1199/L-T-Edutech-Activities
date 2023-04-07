import java.util.*;

class Player {
    private String name;
    private String team;
    private String skill;

    public Player(String name, String team, String skill) {
        this.name = name;
        this.team = team;
        this.skill = skill;
    }

    public String toString() {
        return name + "--" + team + "--" + skill;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getSkill() {
        return skill;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of players");
        int n = sc.nextInt();
        sc.nextLine();  // consume the newline character

        TreeMap<String, Player> players = new TreeMap<String, Player>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of the player " + i);
            String capNumber = sc.nextLine();
            String name = sc.nextLine();
            String team = sc.nextLine();
            String skill = sc.nextLine();

            Player player = new Player(name, team, skill);
            players.put(capNumber, player);
        }

        System.out.println("Player Details");
        for (Map.Entry<String, Player> entry : players.entrySet()) {
            String capNumber = entry.getKey();
            Player player = entry.getValue();
            System.out.println(capNumber + "--" + player.toString());
        }

        System.out.println("Enter the cap number of the player to be searched");
        String capNumberToSearch = sc.nextLine();
        if (players.containsKey(capNumberToSearch)) {
            Player player = players.get(capNumberToSearch);
            System.out.println("Player Details");
            System.out.println(player.getName() + "--" + player.getTeam() + "--" + player.getSkill());
        } else {
            System.out.println("Player not found");
        }

    
    }
}
