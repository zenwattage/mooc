import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            System.out.print("Name:");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                
                System.out.println("Program's maximum duration?");
                int maxDur = Integer.valueOf(scanner.nextLine());
                
                for(TelevisionProgram check : programs){
                    if(check.getDuration() <= maxDur){
                        System.out.println(check);
                    }
                }
                break;
            }
            
            System.out.print("Duration:");
            int dur = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, dur));
            
        }
        
        
        
//            for(TelevisionProgram show : programs){
//                System.out.println(show.getName() + "," + show.getDuration());
//            }
    }
}
