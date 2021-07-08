import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    private ArrayList<Player> players = new ArrayList<Player>();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {

        String input;
        System.out.println("Enter code");

        while (true) {
            input = scanner.nextLine();
            switch(input.toUpperCase()) {
                case "A":
                    addPlayer();
                    break;
                case "V":
                    viewPlayers();
                    break;
                case "B":
                    bestBatsmen();
                    break;
                case "C":
                    bestBowler();
                    break;
                default:
                    System.out.println("");
            }
        }

    }
    public void addPlayer() {
        System.out.println("Enter player name: ");
        String name = scanner.nextLine();
        System.out.println("Enter player Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter player type: ");
        String type = scanner.nextLine();
        System.out.println("Enter player runs: ");
        int runs = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter player wickets: ");
        int wickets = scanner.nextInt();

        Player player = new Player(name,age,type,runs,wickets);
        players.add(player);
        System.out.println("player added");



    }
    public void viewPlayers() {
        System.out.println(players);

    }

    public void bestBatsmen() {
        String currentMaxName = players.get(0).getName();
        int currentMaxRuns = players.get(0).getRuns();
        for (int i=0; i<players.size();i++) {
            if (currentMaxRuns < players.get(i).getRuns()) {
                currentMaxName = players.get(i).getName();
                currentMaxRuns = players.get(i).getRuns();
            }

        }
        System.out.println(currentMaxName);
        System.out.println(currentMaxRuns);

    }
    public void bestBowler() {
        String currentMaxName = players.get(0).getName();
        int currentMaxRuns = players.get(0).getWickets();
        for (int i=0; i<players.size();i++) {
            if (currentMaxRuns < players.get(i).getWickets()) {
                currentMaxName = players.get(i).getName();
                currentMaxRuns = players.get(i).getWickets();
            }

        }
        System.out.println(currentMaxName);
        System.out.println(currentMaxRuns);

    }


}
