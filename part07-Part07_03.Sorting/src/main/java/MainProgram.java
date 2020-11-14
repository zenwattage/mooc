
import java.util.Arrays;

/**
 * 
 * @author sdptw
 */
public class MainProgram {
    /**
     * 
     * @param arr
     * @return 
     */
    public static int smallest(int[] arr){
        int index = arr[0];
        for(int each : arr){
            if(each < index){
                index = each;
            }
        }
        return index;
    }
    
    /**
     * 
     * @param arr
     * @return 
     */
    public static int indexOfSmallest(int[] arr){
        
        return arr[smallest(arr)];
    }
    
    
    /**
     * 
     * @param arr
     * @param startIndex
     * @return 
     */
    public static int indexOfSmallestFrom(int[] arr, int startIndex){
        int smallest = arr[startIndex];
        int index = startIndex;
        
        for(int i = startIndex; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * 
     * @param arr
     * @param index1
     * @param index2 
     */
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        
    }
    
    /**
     * 
     * @param arr 
     */
    public static void sort(int[] arr){
        
        int index = 0;
        
        for(int i = 0; i < arr.length; i++){
            index = indexOfSmallestFrom(arr, i );
            swap(arr, i, index);
        }
         
    }
    
    
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // write your test code here
        int[] array1 = {3, 25, 5, 99, 2, 12};
        
        System.out.println("Smallest: " + MainProgram.smallest(array1));
        
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array1));
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        
        int[] numbers2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2));
        
        
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers3);
        System.out.println(Arrays.toString(numbers3));
        
        
    }

}
