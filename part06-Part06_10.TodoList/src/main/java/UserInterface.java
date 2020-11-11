/**
 *
 * @author sdptw
 */


import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if(command.equalsIgnoreCase("stop")){
                break;
            }
            
            if(command.equalsIgnoreCase("add")){
                System.out.println("To add: ");
                String add = scanner.nextLine();
                list.add(add);
            }
            
            if(command.equalsIgnoreCase("list")){
                list.print();
            }
            
            if(command.equalsIgnoreCase("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                list.remove(index);
            }
            
            
            
        }
        
    }
    
    
    
    
}
