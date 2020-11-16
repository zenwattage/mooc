
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Main {
    
    public static void sort(int[] arr){
        Arrays.sort(arr);
        //System.out.println(arr.toString());
        for(int each : arr){
            System.out.println(each);
        }
    }
    
    public static void sort(String[] arr){
        Arrays.sort(arr);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        sort(array);
        
    }

}
