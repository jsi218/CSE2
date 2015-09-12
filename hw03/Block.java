//Joseph Inglis
//Block
//
//use the scanner class to calculate volume and surface area of a block

import java.util.Scanner;

//define a class
public class Block {
    //main method
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Enter the length of the block: ");
    // prompt user for length of block
    double Length = myScanner.nextDouble(); //accept user input for length
    
    System.out.print("Enter the width of the block: ");
    // prompt user for width of block
    double Width = myScanner.nextDouble(); //accept user input for width
    
    System.out.print("Enter the height of the block: ");
    // prompt user for length of block
    double Height = myScanner.nextDouble(); //accept user input for height
    
    // ouput variables
    
    double surfaceArea;
    double Volume;
    
    Volume = (Length*Width*Height); //calculate volume
    surfaceArea = 2*( (Length*Width) + (Length*Height) + (Width*Height)); //calculates surface area
    
    System.out.println("The volume of a block with dimensions " + Length + " x " + Width + " x " +
                            Height + " is " + Volume); //print volume of block
    System.out.println("The surface area of a block with dimensions " + Length + " x " + Width + " x " +
                            Height + " is " + surfaceArea);

    } //end of main method
} //end of class