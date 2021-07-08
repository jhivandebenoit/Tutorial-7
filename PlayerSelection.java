import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {
    private ArrayList<String> players = new ArrayList<String>();
    private Scanner scanner = new Scanner(System.in);

    public void menu() {

        String input;
        System.out.println("Enter code");
        input = scanner.nextLine();
        while (true) {
            switch(input.toUpperCase()) {
                case "A":
                    addPlayer();
                    break;
                case "V":
                    viewPlayers();
                    break;
            }
        }

    }
    public void addPlayer() {
        System.out.println("Enter player name: ");
        players.add(scanner.nextLine());


    }
    public void viewPlayers() {
        System.out.println(players);

    }

}
