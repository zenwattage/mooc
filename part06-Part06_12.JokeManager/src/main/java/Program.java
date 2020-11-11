
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager manager = new JokeManager();
        
        ArrayList<String> jokes = new ArrayList<>();
        
        UserInterface userinterface = new UserInterface(manager, scanner);
        userinterface.start();
    }
}
