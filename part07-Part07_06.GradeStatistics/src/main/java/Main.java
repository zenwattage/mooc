
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rubric rubric = new Rubric();
        UserInterface ui = new UserInterface(scanner, rubric);
        ui.start();
    }
}
