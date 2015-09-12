//Joseph Inglis
//Timer
//
//use the scanner class to obtain cost of check, tip, and ways to split check

import java.util.Scanner;

//define a class
public class Timer {
    //main method
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Enter the current time: "); 
    //prompt user for current time
    
    int currentTime = myScanner.nextInt(); //accept user input for current time
    
    System.out.print("Enter the time that you will be eating: ");
    // prompt user time they will be eating
    
    int dinnerTime = myScanner.nextInt(); //accept user input for dinner time
    
    //output variables
    
    int hours, minutes; //for calculating time remaining
    int timeRemaining;
    
    timeRemaining = dinnerTime - currentTime; //calculates remaining time *this is not perfect
    
    hours = (int) (timeRemaining/100); //calculates hours until dinner
    minutes = timeRemaining - (hours*100); //calculates minutes until dinner
    
    if (minutes >= 60)
        minutes = minutes - 40; //if minutes > or = 60 then -40
    else
        minutes = minutes; 
        
    System.out.println("You have " + hours + " hours and " + minutes + " minutes until dinner.");
    //print time until dinner
    
    } //end of main method
} //end of class