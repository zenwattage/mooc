
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double avgNums = 0;
        int numCount = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            
            
            
            if(input == 0){
                break;
            }
        }
        
        System.out.println("Average of the numbers: " + avgNums);
    }
}
