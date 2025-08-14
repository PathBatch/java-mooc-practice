
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveSum = 0;
        int positiveCount = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                positiveSum = positiveSum + input;
                positiveCount = positiveCount + 1;
            }
        }
        if (positiveSum <= 0) {
            System.out.println("Cannot calculate the average");
        }
        if (positiveSum > 0) {
            System.out.println( (double) positiveSum / positiveCount);
        }

    }
}
