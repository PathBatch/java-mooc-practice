
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        System.out.println("This is the beginning");
        //Below is my attempt at using boolean for a recreation of larger than or equal to
        Scanner scannertool = new Scanner (System.in);
        System.out.println("Give a number:");
        int firstnum = Integer.valueOf(scannertool.nextLine());
        System.out.println("Give another number:");
        int secondnum = Integer.valueOf(scannertool.nextLine());
        boolean isMoreThan = firstnum > secondnum;
        if (isMoreThan) {
            System.out.println(firstnum + " is greater than " + secondnum);
        } else {
            System.out.println(firstnum + " is not greater than " + secondnum);
        }
        
    }
}
