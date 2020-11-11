
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        ArrayList items = new ArrayList<>();        
        
        while(true){
            System.out.println("Identifier?(empty will stop");
            String ident = scanner.nextLine();
            
            if(ident.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            
            
            Item item = new Item(ident, name);
            
            if(!items.contains(item)){
                items.add(item);
            }
                       
        }
        
        items.forEach((item) -> {
            System.out.println(item);
        });

    }
}
