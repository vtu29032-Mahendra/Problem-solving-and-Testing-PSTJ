import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            players.add(new Player(name, score));
        }

        Collections.sort(players, (a, b) -> {
            if (a.score != b.score) {
                return b.score - a.score;
            }

            return a.name.compareTo(b.name);
        });

        System.out.println("Sorted players:");

        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }

        sc.close();
    }
}