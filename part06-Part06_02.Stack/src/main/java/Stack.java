import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sdptw
 */
public class Stack {
    
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        
        return list.isEmpty();
    }
    
    public void add(String value){
        list.add(value);
    }
    
    public ArrayList<String> values(){
        
        return list;
    }
    
    
    
    public String take(){
        //if the list has more than 1 item in it
        if(list.size() >= 1){
            //get index number of last position
            int pos = list.size() - 1; 
            
            //get the string value at position
            String value = list.get(pos);
            
            // remove the value from the list            
            list.remove(pos);
            
            // return the value removed
            return value;
        }
        else {
            return null;
        }
    }
    
    
    
}
