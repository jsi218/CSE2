/* The purpose of this lab is to use seperate methods to calculte the mean (average) and 
    median (middle number) of 5 doubles and then print their output
Josph Inglis
10/17/15
lab 8 - Stats
*/

import java.util.Scanner;

//define a class
public class Stats {
    //method #1 determines if all inputs are valid
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    double input1 = 0;
    double input2 = 0;
    double input3 = 0;
    double input4 = 0;
    double input5 = 0;
        
    System.out.print("Input first double: "); //prompt user to input double
    input1 = myScanner.nextDouble(); //accept user input for first double
    
    for (int a = 0; a == 0; a = a) {
        
        System.out.print("Input second double: "); //prompt user to input double
        input2 = myScanner.nextDouble(); //accept user input for first double
    
        if (input2 < input1) {
            System.out.println("input must be greater than the previous input");
        }
        else {
            a = 1;
        }
    }
    
    for (int b = 0; b == 0; b = b) {
        
        System.out.print("Input third double: "); //prompt user to input double
        input3 = myScanner.nextDouble(); //accept user input for first double
    
        if (input3 < input2) {
            System.out.println("input must be greater than the previous input");
        }
        else {
            b = 1;
        }
    }
    
    for (int c = 0; c == 0; c = c) {
        
        System.out.print("Input fourth double: "); //prompt user to input double
        input4 = myScanner.nextDouble(); //accept user input for first double
    
        if (input4 < input3) {
            System.out.println("input must be greater than the previous input");
        }
        else {
            c = 1;
        }
    }
    
    for (int d = 0; d == 0; d = d) {
        
        System.out.print("Input fifth double: "); //prompt user to input double
        input5 = myScanner.nextDouble(); //accept user input for first double
    
        if (input5 < input4) {
            System.out.println("input must be greater than the previous input");
        }
        else {
            d = 1;
        }
    }
    
    double average = mean(input1, input2, input3, input4, input5);
    double g = median(input3);
    
    System.out.println(" ");
    System.out.println("Mean of inputs = " + average);
    System.out.println("Median of inputs = " + g );
    
    }
    
    // second method for calculating mean
    public static double mean(double input1, double input2, double input3, double input4, double input5) {
    
    double mean = (input1 + input2 + input3 + input4 + input5) / 5;
    return mean;
    
    } //end of second method
    
    // 3rd method for calculating median
    public static double median( double input3 ) {
        
    double median = input3;
    return median;
    
    } //end of third method
    
    // 4th method for printing mean and median
    public static void print( double mean, double median) {
        
    System.out.println("Mean of inputs = " + mean );
    System.out.println("Median of inputs = " + median );
    
    }//end of fourth method
    
} //end of class