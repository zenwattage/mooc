
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String num = scanner.nextLine();
            
            if(num.equals("end")){
                break;
            }
           
            int inNum = (int) Integer.valueOf(num);
            
            int cube = inNum * inNum * inNum;
           
            System.out.format("%d%n",cube);
            
            
        }
        
        
    }
}
