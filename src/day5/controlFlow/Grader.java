/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5.controlFlow;

/**
 *
 * @author Oka
 */
public class Grader {
    
    public String grade(int marks){
        if(marks > 90){
            return "Grade A";
        }else if(marks > 75){
            return "Grade B";
        }else if(marks > 60){
            return "Grade C";
        }else if(marks > 45){
            return "Grade D";
        }else if(marks > 30){
            return "Grade E";
        }else{
            return "Grade F";
        }
    }
    
}
