
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double sum = 0.0;
        int count = 0;
        //String longest = "";
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> yearList = new ArrayList<>();
        ArrayList<String> wholeList = new ArrayList<>();
        ArrayList<String> longestList = new ArrayList<>();
        
        
        while(true){
            
            String input = scanner.nextLine();           
            
            if(input.equals("")){
                break;
            }
            
            
            String[] parts = input.split(",");
            
            nameList.add((parts[0]));
            yearList.add((Integer.valueOf(parts[1])));
            
            wholeList.add(parts[0] +","+ parts[1]);
            
        }
        
        for(int years : yearList)
        {
            count++;
            sum += (double)years;
        }
        
        String longest = nameList.get(0);
        for(int i = 0; i < nameList.size(); i++)
        {
                        if(nameList.get(i).length() > longest.length())
                        {
                            longest = nameList.get(i);
                        }
//                        else {
//                            longest = start;
//                        }
        }
        
        System.out.println(longest);
        System.out.println(sum / count);
    }
}
