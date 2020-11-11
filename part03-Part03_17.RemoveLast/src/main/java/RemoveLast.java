
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    
    
    public static void removeLast(ArrayList<String> strings){
        //if list is empty do nothing
        // remove last index
        // remove length - 1
        int lengthcount = strings.size();
        if(lengthcount > 0){
            strings.remove(lengthcount - 1);            
        }
        
    }
}
