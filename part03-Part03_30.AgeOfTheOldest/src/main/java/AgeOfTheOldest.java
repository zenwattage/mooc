
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int highest = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            
            String input = scanner.nextLine();           
            
            if(input.equals("")){
                break;
            }
            
            String[] parts = input.split(",");
            
            list.add(Integer.valueOf(parts[1]));    
            
        }
        
        for(int each: list){
            
            if(each > highest){
                highest = each;
            }
            System.out.println(each);
        }
        System.out.println(highest);
    }
}
