/* The purpose of this lab is to use linear arrays and searches to find the 
    maximum and minimum values in very large arrays
Joseph Inglis
11/6/15
hw10 Search
*/

import java.util.Scanner;

public class Search {
    
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    //create values of array1
    int i = 0;
    int array1[] = new int [5000];
    for ( i = 0; i < 5000; i++) {
        array1[i] = (int) (Math.random() * 100001);
    }
    //search array1
    int min = array1[0];
    int max = array1[0];
    for ( i = 0; i < 5000; i++ ) {
        if (array1[i] < min ) {
            min = array1[i];
        }
        if (array1[i] > max) {
            max = array1[i];
        }
    }
    //print min and max of array1
    System.out.println("The minimum value of array1 is " + min);
    System.out.println("The maximum value of array1 is " + max);
    
    //create values of array2
    int array2[] = new int [5000];
    for ( i = 0; i < 4999; i++) {
        array2[i] = (int) (Math.random() * 100001);
        if (array2[i + 1] < array2[i] ) {
            array2[i + 1] = (array2[i] + ((int) (Math.random() * 10)));
        }
    }
    
    //search array 2
    min = array2[0];
    max = array2[0];
    for ( i = 0; i < 5000; i++ ) {
        if (array2[i] < min ) {
            min = array2[i];
        }
        if (array2[i] > max) {
            max = array2[i];
        }
    }
    //print min and max of array 2
    System.out.println("The minimum value of array2 is " + min);
    System.out.println("The maximum value of array2 is " + max);
    
    //prompt user to enter and integer
    System.out.print("Enter an int: ");
    int x = myScanner.nextInt();
    int n = array2.length;
    int midpiont = (int) (n - 1)/2;
    boolean acceptable = false;
    int start = 0;
    int end = n - 1;
    
    if ( x > 0) {
        while ( !acceptable ) {
            if (array2[midpiont] == x) {
                System.out.println( x + " is in array2");
                acceptable = true;
            }
            else if ( array2[midpiont] > x && array2[midpiont - 1] < x ) {
                System.out.println( x + " is NOT is array2");
                System.out.println( x + " is between " + array2[midpiont] + "and" + array2[midpiont - 1]);
                acceptable = true;
            }
            else if ( array2[midpiont] < x && array2[midpiont + 1] > x ) {
                System.out.println( x + " is NOT is array2");
                System.out.println( x + " is between " + array2[midpiont] + "and" + array2[midpiont + 1]);
                acceptable = true;
            }
            else if (array2[midpiont] > x && array2[start] < x ) {
                end = midpiont;
                start = start;
                midpiont = (int) ((start + end)/2);
            }
            else if (array2[midpiont] < x && x < array2[end] ) {
                end = end;
                start = midpiont;
                midpiont = (int) ((start + end)/2);
            }
        }
    }

}}