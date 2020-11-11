
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have it's contents printed?");
        
        String user = scanner.nextLine();
        try(Scanner myScanner = new Scanner(Paths.get(user))){
            
            while(myScanner.hasNextLine()){
                String row = myScanner.nextLine();
                
                System.out.println(row);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
       
    }
}
