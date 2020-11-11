
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        
        if(array.length != 0){
            // Write some code in here
            int index = 0;
            int count = array[0];
            while(index < array.length){            
                for(int i = 0; i < count; i++ ){
                    System.out.print("*");
                    count = array[index];                
                }
                System.out.println();
                index++;    
            }
            
        }
        
        
    }

}
