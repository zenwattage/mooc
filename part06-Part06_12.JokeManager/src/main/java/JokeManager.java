import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author sdptw
 */
public class JokeManager {
    
    private ArrayList<String> jokes;
    
    public JokeManager(){        
        jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        if(jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        
        Random rand = new Random();
        int index = rand.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes() {
        System.out.println("Printing jokes:1");
        for(String joke : jokes){
            System.out.println(joke);
        }
    }
}
