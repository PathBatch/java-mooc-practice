
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String info = scanner.nextLine();
                String[] parts = info.split(",");
                String teamOneName = parts[0];
                String teamTwoName = parts[1];
                int teamOneScore = Integer.valueOf(parts[2]);
                int teamTwoScore = Integer.valueOf(parts[3]);
                if (teamOneName.equals(team) || teamTwoName.equals(team)) {
                    games++;
                }
                if (teamOneName.equals(team) && teamOneScore > teamTwoScore) {
                    wins++;
                } else if (teamOneName.equals(team) && teamOneScore < teamTwoScore) {
                    losses++;
                }
                 if (teamTwoName.equals(team) && teamOneScore < teamTwoScore) {
                    wins++;
                } else if (teamTwoName.equals(team) && teamOneScore > teamTwoScore) {
                    losses++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
