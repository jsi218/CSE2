/* The purpose of this lab is to use seperate methods to print the area of a triangle, 
    rectangle, and circle
Josph Inglis
10/19/15
hw08 Area
*/

import java.util.Scanner;

//define a class
public class Area {
    //method #1 determines if all inputs are valid
    public static void main(String[] args) {
    
    String Shape = InputCheck();
    
    if ( Shape.equals("circle") ) {
        double CircleArea = Circle();
        System.out.println("The area of the circle is " + CircleArea + " units squared");
    }
    if ( Shape.equals("triangle") ) {
        double TriArea = Triangle();
        System.out.println("The area of the triangle is " + TriArea + " units squared");
    }
    if ( Shape.equals("rectangle") ) {
        double RectArea = Rectangle();
        System.out.println("The area of the rectangle is " + RectArea + " units squared");
    }
    
    } //end main method
    
    //method to check input
    public static String InputCheck() {
    
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    int a = 0;
    
    String Shape = "abc";
    
    while (a == 0) {
        
        String circle = "aaa";
        String rectangle = "bbb";
        String triangle = "ccc";

        System.out.print("Please enter a valid shape: ");
    
        Shape = myScanner.nextLine();//accept input for shape
        
        if ( Shape.equals("circle") ) {
            a = 1;
        }
        else if ( Shape.equals("rectangle") ) {
            a = 1;
        }
        else if ( Shape.equals("triangle") ) {
            a = 1;
        }
        else { //if input is not correct error is printed and your return to the start of the loop
            System.out.println("ERROR: not a valid shape");
            System.out.println("Valid shapes are a triangle, circle, or rectangle");
        }
    }
    
    return Shape;
    
    }//end of InputCheck method
    
    //method to calculate area of a circle
    public static Double Circle() {
    
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Input the radius of the circle: "); //prompt user for double
    
    double radius = 0;
    boolean acceptable = false; //swtich for determining if to ask again
    
    while ( !acceptable ) {
        
        if ( myScanner.hasNextDouble() ) { //check if input is an integer
            radius = myScanner.nextDouble(); //accept user input
            
            if ( radius > 0 ) {
                acceptable = true; //if input is acceptable then store value
                continue;
            }
            else {
                System.out.println("ERROR: input must be in the form of a positive double");
                System.out.print("Input the radius of the circle: "); //prompt user for double
                myScanner.nextLine(); //if input is invalid then enter a new one
            }
        }
        else {
            System.out.println("ERROR: input must be in the form of a positive double");
            System.out.print("Input the radius of the circle: "); //prompt user for double
            myScanner.nextLine(); //if input is invalid then enter a new one
        }
        
    }
    
    double CircleArea = (radius * radius * 3.141592654);
    
    return CircleArea;
    
    } //end of Circle method
    
    //method to calculate area of a triangle
    public static Double Triangle() {
    
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Input the base of the triangle: "); //prompt user for double
    
    double base = 0;
    boolean acceptable1 = false; //swtich for determining if to ask again
    
    while ( !acceptable1 ) {
        
        if ( myScanner.hasNextDouble() ) { //check if input is an integer
            base = myScanner.nextDouble(); //accept user input
            
            if ( base > 0 ) {
                acceptable1 = true; //if input is acceptable then store value
                continue;
            }
            else {
                System.out.println("ERROR: input must be in the form of a positive double");
                System.out.print("Input the base of the triangle: "); //prompt user for double
                myScanner.nextLine(); //if input is invalid then enter a new one
            }
        }
        else {
            System.out.println("ERROR: input must be in the form of a positive double");
            System.out.print("Input the base of the triangle: "); //prompt user for double
            myScanner.nextLine(); //if input is invalid then enter a new one
        }
        
    }
    
    System.out.print("Input the height of the triangle: "); //prompt user for double
    
    double height = 0;
    boolean acceptable2 = false; //swtich for determining if to ask again
    
    while ( !acceptable2 ) {
        
        if ( myScanner.hasNextDouble() ) { //check if input is an integer
            height = myScanner.nextDouble(); //accept user input
            
            if ( height > 0 ) {
                acceptable2 = true; //if input is acceptable then store value
                continue;
            }
            else {
                System.out.println("ERROR: input must be in the form of a positive double");
                System.out.print("Input the height of the triangle: "); //prompt user for double
                myScanner.nextLine(); //if input is invalid then enter a new one
            }
        }
        else {
            System.out.println("ERROR: input must be in the form of a positive double");
            System.out.print("Input the height of the triangle: "); //prompt user for double
            myScanner.nextLine(); //if input is invalid then enter a new one
        }
        
    }
    
    double TriArea = (base * height * .5);
    
    return TriArea;
    
    } //end of Triangle method
    
    //method to calculate area of a rectangle
    public static Double Rectangle() {
    
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Input the base of the rectangle: "); //prompt user for double
    
    double base = 0;
    boolean acceptable1 = false; //swtich for determining if to ask again
    
    while ( !acceptable1 ) {
        
        if ( myScanner.hasNextDouble() ) { //check if input is an integer
            base = myScanner.nextDouble(); //accept user input
            
            if ( base > 0 ) {
                acceptable1 = true; //if input is acceptable then store value
                continue;
            }
            else {
                System.out.println("ERROR: input must be in the form of a positive double");
                System.out.print("Input the base of the rectangle: "); //prompt user for double
                myScanner.nextLine(); //if input is invalid then enter a new one
            }
        }
        else {
            System.out.println("ERROR: input must be in the form of a positive double");
            System.out.print("Input the base of the rectangle: "); //prompt user for double
            myScanner.nextLine(); //if input is invalid then enter a new one
        }
        
    }
    
    System.out.print("Input the height of the rectangle: "); //prompt user for double
    
    double height = 0;
    boolean acceptable2 = false; //swtich for determining if to ask again
    
    while ( !acceptable2 ) {
        
        if ( myScanner.hasNextDouble() ) { //check if input is a double
            height = myScanner.nextDouble(); //accept user input
            
            if ( height > 0 ) {
                acceptable2 = true; //if input is acceptable then store value
                continue;
            }
            else {
                System.out.println("ERROR: input must be in the form of a positive double");
                System.out.print("Input the height of the rectangle: "); //prompt user for double
                myScanner.nextLine(); //if input is invalid then enter a new one
            }
        }
        else {
            System.out.println("ERROR: input must be in the form of a positive double");
            System.out.print("Input the height of the rectangle: "); //prompt user for double
            myScanner.nextLine(); //if input is invalid then enter a new one
        }
        
    }
    
    double RectArea = (base * height);
    
    return RectArea;
    
    } //end of Rectangle method
    
}//end of class