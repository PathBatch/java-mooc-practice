
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        System.out.println("This is the beginning");
        //Below is my attempt at adding a scanner
        Scanner scannertool = new Scanner (System.in);
        System.out.println("Please write below:");
        String response = scannertool.nextLine();
        System.out.println(response);
    }
}
