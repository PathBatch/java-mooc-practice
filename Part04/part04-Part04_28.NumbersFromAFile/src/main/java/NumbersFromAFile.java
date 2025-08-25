
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        try (Scanner scannerTwo = new Scanner(Paths.get(file))) {
            while (scannerTwo.hasNextLine()) {
                int number = Integer.valueOf(scannerTwo.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count = count + 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Numbers: " + count);

    }

}
