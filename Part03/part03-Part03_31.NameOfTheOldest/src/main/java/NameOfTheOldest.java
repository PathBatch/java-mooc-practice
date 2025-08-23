
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "Nothing";
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
                    name = parts[i -1];
                }
            }
        }
        System.out.println("Name of the oldest: " + name);


    }
}
