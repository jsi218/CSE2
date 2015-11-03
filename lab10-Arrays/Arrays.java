/* The purpose of this lab is to create and use one dimensional arrays
Joseph Inglis
11/2/15
lab10 Arrays
*/

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in);
    
    int i = 0;
    int Students = (int) ( Math.random() * 5 ) + 6;
    String[] StudentNames = new String [Students];
    
    System.out.println("please input " + Students + " names");
    for ( i = 0; i < Students; i++) {
        StudentNames[i] = myScanner.nextLine();
    }
    
    System.out.println("Here are the grades of the " + Students + " Students");
    
    int scores [] = new int[Students];
    for ( i = 0; i < Students; i++) {
        scores[i] = (int) (Math.random() * 101);
        System.out.print(StudentNames[i] + " " + scores[i]);
        System.out.println(" ");
    }
    

    
    }//end of main method
}//end of class