
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username:");
        String user = scanner.nextLine();
        System.out.print("Enter password:");
        String password = scanner.nextLine();
        boolean login = false;
        if (user.equals("alex") && password.equals("sunshine") || user.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
            login = true;
        }
        if (!login) {
            System.out.println("Incorrect username or password!");
        }
        

    }
}
