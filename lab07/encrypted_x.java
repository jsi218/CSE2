//Joseph Inglis
//encrypted x

/*the purpose of this lab is to learn haw to utilize nested loops in order to create a secret 
"message" in a large grid of stars*/

import java.util.Scanner;

//define a class
public class encrypted_x {
    //main method
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Enter an integer from 0 - 100: "); 
    //prompt user for integer
    
    boolean acceptable = false; //swtich for determining if to ask again
    int xnumber = 0; //initialize xnumber
    
    while ( !acceptable ) {
        
        if ( myScanner.hasNextInt() ) { //check if input is an integer
            xnumber = myScanner.nextInt(); //accept user input for monday expenses
            
            if ( xnumber >=0 && xnumber <= 100 ) { //checks to see if input is within accepted range
                acceptable = true; //if input is acceptable then store value
        
            }
            else {
                System.out.println("Not a valid integer, try again"); 
                System.out.print("Enter an integer from 0 - 100: "); 
                myScanner.nextLine(); //if input is invalid then enter a new one
            }
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        System.out.print("Enter an integer from 0 - 100: "); 
        myScanner.next(); //if input is invalid then enter a new one
        }
    }
    
    int row = 1;//initialize variable
    
    while ( row <= xnumber ) {
        
        int column = 1; //initialize variable
        while ( column <= xnumber ) {
            if (row == column || (column - 1) == (xnumber - row) ) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
            column++;
        }
        System.out.println(" ");
    
    row++;
    }
    
    }}
