
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean found = false;

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try (Scanner scannerTwo = new Scanner(Paths.get(file))) {
            while(scannerTwo.hasNextLine()) {
                if (scannerTwo.nextLine().equals(searchedFor)) {
                    found = true;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
