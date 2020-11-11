
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //get number of days from user
        //return number of seconds equivalent 
        // 24 x 60 x 60 = 86,400
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave " + number);
    }   
}
