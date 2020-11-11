
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt user for number
        System.out.println("Give a number:");
        //get number from user
        double userNum = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + userNum);
    }
}
