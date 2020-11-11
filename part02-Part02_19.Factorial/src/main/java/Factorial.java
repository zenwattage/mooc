
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        for(int i = 2; i <= input; i++){
            // current = current * i;
            factorial *= i;
        }
        System.out.println(factorial);
        
    }
}
