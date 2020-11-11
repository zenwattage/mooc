/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdptw
 */
public class Item {
    
    private String ident;
    private String name;
    
    public Item(String ident, String name){
        this.ident = ident;
        this.name = name;
    }
    
    public String getIdent(){
        return this.ident;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    @Override
    public String toString(){
        return this.ident + ": " + this.name;
    }
    
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Item)){
        return false;
        }
        
        Item comparedItem = (Item) compared;
        
        return ident.equals(comparedItem.ident);
    }
    
    
}
