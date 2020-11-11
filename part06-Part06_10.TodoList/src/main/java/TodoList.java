import java.util.ArrayList;

/**
 *
 * @author sdptw
 */
public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        list.add(task);
    }
    
    public void print() {
        int count = 1;
        for(String each : list){
            System.out.println(count + ": " + each);
            count++;
        }
    }
    
    public void remove(int number){
        list.remove(number - 1);
    }
}
