import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int highest = 0;
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<String> wholeList = new ArrayList<>();
        
        
        while(true){
            
            String input = scanner.nextLine();           
            
            if(input.equals("")){
                break;
            }
            
            
            String[] parts = input.split(",");
            
            nameList.add((parts[0]));
            ageList.add((Integer.valueOf(parts[1])));
            wholeList.add(parts[0] +","+ parts[1]);
            
        }
        
        for(int each: ageList){
            if(each > highest){
                highest = each;
            }
        }
        
        for(String each: wholeList){
            
            if(each.contains(String.valueOf(highest))){
                String[] outName = each.split(",");
                
                String out = String.valueOf(outName[0]);
                
                System.out.println(out);
                
            }
        }
        
    }
}
