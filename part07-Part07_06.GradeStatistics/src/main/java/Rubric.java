
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
public class Rubric {
    
    private ArrayList<Integer> grades;
    
    public Rubric(){
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int grade){
        this.grades.add(grade);        
    }
    
    public double average(){
        int count = 0;
        int total = 0;
        double avg = 0.0;
        for(int each : this.grades){            
            total += each;
            count++;
        }
        avg = count / total ; 
        System.out.println(count);
        System.out.println(total);
        System.out.println(avg);
        return avg;
        
    }
    
    public String toString(){
        return this.grades.toString();
    }
}
