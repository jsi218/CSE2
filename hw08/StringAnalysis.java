/* The purpose of this lab is to use seperate methods to examine all characters of 
    a string and determine if the character is a number or a letter
Josph Inglis
10/20/15
hw08 StringAnalysis
*/

import java.util.Scanner;

//define a class
public class StringAnalysis {
    //method #1 determines if all inputs are valid
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Enter a string: "); //prompts user to input string
        String ABC = myScanner.nextLine(); //accepts input
    
    System.out.print("Do you wish to process the entire String? (yes or no) ");
            String answer = myScanner.nextLine();

    if ( answer.equals("no") ) {
            
        boolean acceptable = false; //swtich for determining if to ask again
    
        while ( !acceptable ) {
            
            System.out.print("To what value should the String be processed: ");
            
            int Stringlength = ABC.length();
                
            if ( myScanner.hasNextInt() ) { //check if input is an integer
                
                int StringPlace = myScanner.nextInt();
                
                if ( StringPlace > 0 ) {
                    acceptable = true;
                }
                if ( StringPlace > Stringlength ) {
                    StringPlace = Stringlength; 
                    acceptable = true;
                }
            }
            else {
                System.out.println("ERROR: input must be in the form of a positive integer");
                myScanner.nextLine(); //if input is invalid then enter a new one
            }
        }
    }
        
    if (answer.equals("yes") ) {
        ABC = ABC;
    }
    else {
        System.out.println("ERROR: input must be 'yes' or 'no'");
        System.out.print("Do you wish to process the entire String? (yes or no) ");
        myScanner.nextLine(); //if input is invalid then enter a new one
    }
    
    boolean character = StringAnalysis( String ABC; int Stringlength; );
    
    if ( character == true ) {
        System.out.println("The character " + char + " is a letter")
    }
    if ( character == false ) {
        System.out.println("The character " + char + " is a number")
    }
    
    }//end of main method
    
    //method to determine if character in String is a number or a letter
    public static boolean StringAnalysis( String ABC ) {
        
    int Stringlength = ABC.length();
        
    for ( int i == 1; i <= Stringlength; i++) {
        char = ABC.charAt(int i);
        
        if ( char >= a && char <= z ) {
            boolean character = true;
        }
        if ( char > 1 or char < 2 ) {
            boolean character = false;
        }
    }
    
    return character;
        
    }// end of first method
    
    //method to determine if character in String is a number or a letter
    public static boolean StringAnalysis( String ABC, int Stringlength ) {
        
    }//end of second method
    
}//end of class
    
    