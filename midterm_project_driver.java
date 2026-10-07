
/**
 * Write a description of class midterm_project_driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class midterm_project_driver
{
    public static void main)(String[] args){
        
    }
    Scanner input = new Scanner(System.in);
    boolean runProgram = true;
    
    while(runProgram){
     
     
     System.out.print("Would you like to create another computer? (Y/N): ");//allows the user to continue the program if they want
         choice = input.next().toUpperCase();
         
        if(!choice.equals("Y")){
             runProgram = false;//if the users choice is not Y then it makes runProgram false so the program stops
             System.out.print("Have a good day!");//displays have a good day when the program stops 
         }
    }
       
    
}