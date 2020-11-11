
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        //get user response
        String message = scanner.nextLine();
        //print user response back to user
        System.out.println(message);
    }
}
