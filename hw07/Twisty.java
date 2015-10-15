/* The purpose of this lab is to become framiliar with loops
Josph Inglis
10/11/15
homework 6
*/

import java.util.Scanner;

//define a class
public class Twisty {
    //main method
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    int length = 0;
    boolean acceptable;
    int a = 0;
    
    while ( a == 0) {
        
        System.out.print("Enter a value for Length: "); 
        //prompt user for integer
    
        acceptable = false; //swtich for determining if to ask again
        length = 0; //initialize length
    
        while ( !acceptable ) {
        
            if ( myScanner.hasNextInt() ) { //check if input is an integer
            length = myScanner.nextInt(); //accept user input for length
            acceptable = true; //if input is acceptable then store value
                if ( length > 0 ) { //checks to see if input is within accepted range
                    a = 1;
                    continue;
                }
                else {
                    System.out.println("Integer must be greater than 0"); 
                    break;
                }
            }
        
            else {
                System.out.println("Error: Not a valid integer, try again"); 
                System.out.print("Enter a value for Length: ");
                myScanner.next();
            }
        }
    }    
    
    acceptable = false; //swtich for determining if to ask again
    int width = 0; //initialize width
    int b = 0;
    
    while ( b == 0 ) {
        
        System.out.print("Enter a value for Width: "); 
        //prompt user for integer
    
        acceptable = false; //swtich for determining if to ask again
    
        while ( !acceptable ) {
        
            if ( myScanner.hasNextInt() ) { //check if input is an integer
            width = myScanner.nextInt(); //accept user input for length
            acceptable = true; //if input is acceptable then store value
                if ( width > 0 && width <= length ) { //checks to see if input is within accepted range
                    b = 1;
                    continue;
                }
                else {
                    System.out.println("Integer must be greater than 0 and less than Length"); 
                    break;
                }
            }
        
            else {
                System.out.println("Error: Not a valid integer, try again"); 
                System.out.print("Enter a value for Width: "); 
                myScanner.next(); //if input is invalid then enter a new one
            }
        }
    }

    for ( int count1 = 1; count1 <= width; count1++ ) {
        
        for ( int count2 = 1; count2 <= length; count2++) {
            if ( (count2 % count1) == 0 && count2 <= count1 ) {
                System.out.print("#");
            }
            else {
                System.out.print(" ");
            }
        }
    System.out.println(" ");
    }
        
    }}
    
    