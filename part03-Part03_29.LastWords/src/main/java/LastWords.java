
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            
            String[] splitInput = input.split(" ");
            
            if(input.equals("")){
                break;
            }
            
            
            System.out.println(splitInput[splitInput.length -1]);
        }

    }
}
