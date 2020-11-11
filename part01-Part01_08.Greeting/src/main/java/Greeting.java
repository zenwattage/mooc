
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt user for name
        System.out.println("What's your name?");
        
        //get user input
        String name = scanner.nextLine();
        
        //return hi + user's input
        System.out.println("Hi " + name);
    }
}
