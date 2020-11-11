import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdptw
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
   public TextUI(Scanner scanner, SimpleDictionary dictionary){
       this.scanner = scanner;
       this.dictionary = dictionary;
   }
   
   public void start(){
//       System.out.println("Command:");
//       String userInput = scanner.nextLine();
       
       while(true){
           
           System.out.println("Command:");
           String userInput = scanner.nextLine();
           
           if(userInput.equals("end")){
               System.out.println("Bye bye!");
               break;
           }
           
           if(userInput.equals("add")){
               String word = "";
               String translation = "";
               
               System.out.println("Word:");
               word = scanner.nextLine();
               System.out.println("Translation:");
               translation = scanner.nextLine();
               
               dictionary.add(word,translation);
               
           }
           else if(userInput.equals("search")){
               
               String translate = "";
               
               System.out.println("To be translated:");
               translate = scanner.nextLine();
               
               if(dictionary.translate(translate) == null){
                   System.out.println("Word " + translate + " was not found");
               }
//               
//               String translation = dictionary.translate(translate);
               
//               if(translation.){
//                   System.out.println("Word " + translate + " was not found");
//               }
               else {
                   System.out.println("Translation: " + dictionary.translate(translate));
               }
                             
           
       }
           else{
               System.out.println("Uknown command");
           }
       }
   }
   
   
}
