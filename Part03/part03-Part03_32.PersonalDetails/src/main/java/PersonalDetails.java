
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int longestLength = 0;
        String longestName = "";
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] parts = line.split(",");
            String name = parts[0];
            int year = Integer.valueOf(parts[1]);
            
            if (name.length() > longestLength) {
                longestLength = name.length();
                longestName = name;
            }
            sum = sum + year;
            count = count + 1;
        }
        double average = 1.0 * sum / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);


    }
}
