
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int highest = 0;
        
        if(number1 >= number2 && number1 >= number3){
            highest = number1;
        }
        
        if(number2 >= number3 && number2 >= number1){
            highest = number2;
        }
        
        if(number3 >= number2 && number3 >= number1){
            highest = number3;
        }
        
        
        
        return highest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        
        System.out.println("Greatest: " + result);
    }
}
