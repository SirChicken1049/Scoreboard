import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class GameSimulator {
    private static final String[] teams = {
            "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"
    };
    private static Team[] standings = new Team[teams.length];

    public static void main(String[] args) throws FileNotFoundException {
        new GameSimulator(1000);
    }

    public GameSimulator(int games) throws FileNotFoundException {
        for (int i = 0; i < teams.length; i++) {
            standings[i] = new Team(teams[i]);
        }
        play();
        printStandings();
    }

    public void play() throws FileNotFoundException {
        Scanner s = new Scanner(new File("Scoreboard.txt"));
        while (s.hasNext()) {
            String teamOne = s.next();
            String teamTwo = s.next();
            Scoreboard sb = new Scoreboard(teamOne, teamTwo);
            while (s.hasNextInt()) {
                sb.recordPlay(s.nextInt());
            }
            if (sb.win().equals("Red")) {
                standings[0].wins();
            }
            if (sb.win().equals("Orange")) {
                standings[1].wins();
            }
            if (sb.win().equals("Yellow")) {
                standings[2].wins();
            }
            if (sb.win().equals("Green")) {
                standings[3].wins();
            }
            if (sb.win().equals("Blue")) {
                standings[4].wins();
            }
            if (sb.win().equals("Indigo")) {
                standings[5].wins();
            }
            if (sb.win().equals("Violet")) {
                standings[6].wins();
            }

        }
    }
    public void printStandings() {
        sort();
        for (Team t : standings)
            System.out.println(t + "" + t.getWins());
    }
    public void sort() {
        for (int i = 0; i < standings.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < standings.length; j++) {
                if (standings[j].getWins() > standings[max].getWins()) ;
                max = j;
            }
            if (i != max) {
                Team temp = standings[i];
                standings[i] = standings[max];
                standings[max] = temp;
            }
        }
    }
}