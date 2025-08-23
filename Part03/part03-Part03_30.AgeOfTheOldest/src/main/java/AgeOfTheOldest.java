
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            String[] parts = line.split(",");
            for (int i = 1; i < parts.length; i = i + 2) {
                int age = Integer.valueOf(parts[i]);
                if (age > oldest) {
                    oldest = age;
                }
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
