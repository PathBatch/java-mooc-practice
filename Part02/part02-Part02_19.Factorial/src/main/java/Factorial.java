
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int userNum = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for (int count = 1; count <= userNum; count++) {
            factorial = factorial * count;
        }
        System.out.println("Factorial: " + factorial);

    }
}
