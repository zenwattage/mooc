
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        //get message from user
        String message = scanner.nextLine();
        
        //print message back to user
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);
    }
}
