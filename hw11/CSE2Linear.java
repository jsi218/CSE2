/* The purpose of this lab is to create and use one dimensional arrays and to 
    use a linear search to find specific values
Joseph Inglis
11/7/15
hw11-CSE2Linear
*/

import java.util.Scanner;

//define a class
public class CSE2Linear {
    //method #1 determines if all inputs are valid
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in);
    
    int[] grades = new int [15];
    int i = 0;
    
    System.out.println("Enter 15 integers for the students' final grades");
    
    for ( i = 0; i < grades.length; i++) {
        boolean acceptable = false;
        while (!acceptable) {
            if ( myScanner.hasNextInt() ) { //checks if an input is an integer
                grades[i] = myScanner.nextInt();
            
                if ( grades[i] <= 100 && grades[i] >= 0 ) { //checks if integer is between 0 and 100
                    if ( i == 0 ) {
                        acceptable = true;
                        continue;
                    }
                    if ( i >= 1 && grades[i] >= grades[i - 1] ) { //checks if input value is creater than previous input
                        acceptable = true;
                        continue;
                    }
                    else {
                        System.out.println("ERROR#3; the input must be greater than of equal to the previous grade");
                        System.out.println("Enter value of student " + (i + 1) + "'s grade");
                        myScanner.nextLine();
                    }
                }
                else {
                    System.out.println("ERROR#1: the input must be between 0 and 100");
                    System.out.println("Enter value of student " + (i + 1) + "'s grade");
                    myScanner.nextLine();
                }
            }
            else {
                System.out.println("ERROR#2: the input must be in the form of an integer");
                System.out.println("Enter value of student " + (i + 1) + "'s grade");
                myScanner.nextLine();
                continue;
            }
        }
    }
    
    //print values of array
    System.out.print("Students' grades in order: ");
    for (i = 0; i < grades.length; i++) {
        System.out.print(grades[i] + " ");
    }
    System.out.println(" ");
    
    //ask user to input an integer to find in array
    System.out.println("Enter a value that you wish to find");
    int x = myScanner.nextInt();
    
    //linear search array for integer
    for (i = 0; i < grades.length; i++) {
        if ( x == grades[i] ) {
            System.out.println(x + " was found on the list with " + (i + 1) + " iterations");
            break;
        }
        if ( x < grades[i] ) {
            System.out.println(x + " was not found on the list with " + (i + 1) + " iterations");
            break;
        }
        if ( x > grades[14] ) {
            System.out.println(x + " was not found on the list with " + (15) + " iterations");
            break;
        }
    }
    
    //Shuffle the 15 grades randomly and print new list
    int n = 0, temp = 0;
    System.out.println("Studens' grades in random order: ");
    for (i =0; i < grades.length; i++ ) {
        n = (int) ( 15 * Math.random() );
        temp = grades[n];
        grades[n] = grades[i];
        grades[i] = temp;
        System.out.print( grades[i] + " ");
    }
    System.out.println(" ");
    
    //ask user to input an integer to find in array
    System.out.println("Enter a value that you wish to find");
    int y = myScanner.nextInt();
    
    //linear search array for integer
    int count = 0;
    for (i = 0; i < grades.length; i++) {
        if ( y == grades[i] ) {
            System.out.println(y + " was found on the list with " + (i + 1) + " iterations");
            break;
        }
        count++;
        if ( count == 14 ) {
            System.out.println(y + " was not found on the list with " + 15 + " iterations");
            break;
        }
    }
    
    } //end of main method
} //end of class