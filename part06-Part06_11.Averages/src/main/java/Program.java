
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
        
//        register.addGradeBasedOnPoints(93);
//        register.addGradeBasedOnPoints(91);
//        register.addGradeBasedOnPoints(92);
//        register.addGradeBasedOnPoints(88);
//
//        System.out.println(register.averageOfGrades());
//        register.addGradeBasedOnPoints(93);
//        register.addGradeBasedOnPoints(91);
//        register.addGradeBasedOnPoints(92);

        System.out.println("The average of points: " + register.averageOfPoints());
        System.out.println("The average of grades: " + register.averageOfGrades());
        
    }
}
