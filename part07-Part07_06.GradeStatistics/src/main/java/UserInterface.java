
import java.util.Scanner;
/**
 *
 * @author sdptw
 */
public class UserInterface {
    private Scanner scanner;
    private Rubric grader;
    
    public UserInterface(Scanner scanner, Rubric rubric){
        this.scanner = new Scanner(System.in);                
        this.grader = rubric;       
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops: ");      
        while(true){            
            int input = scanner.nextInt();
            if(input == -1){
                break;
            }
            grader.addGrade(input);
            
        
        }
        
        //average the count;
        System.out.println(grader.average());
        System.out.println(grader.toString());
    }
}
