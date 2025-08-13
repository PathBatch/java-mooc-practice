
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String stringOne = scan.nextLine();
        System.out.println("Enter the second string:");
        String stringtwo = scan.nextLine();
        if (stringOne.equals(stringtwo)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
