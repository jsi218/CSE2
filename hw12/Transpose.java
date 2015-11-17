/* The purpose of this lab is to become framiliar with manipulating multidemensional arrays
Joseph Inglis
11/16/15
hw 12 matrix transposition
*/

import java.util.Scanner;

public class Transpose {
    
    public static void main(String[] args) {
    
        Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
        
        int width = 0;
        int height = 0;
        boolean acceptable1 = false;
        boolean acceptable2 = false;
        
        System.out.print("Enter the heigh: ");
        while (!acceptable1) {
            if ( myScanner.hasNextInt() ) { //checks if an input is an integer
                
                height = myScanner.nextInt();
                
                if ( height > 0 ) { //checks if integer is between 0 and 100
                    acceptable1 = true;
                    break;
                }
                else {
                    System.out.println("ERROR: the input must be greater than 0");
                    System.out.print("Enter the height: ");
                    myScanner.nextLine();
                }
            }
            else {
                System.out.println("ERROR: the input must be in the form of an integer");
                System.out.print("Enter the height: ");
                myScanner.nextLine();
                continue;
            }
        }
        
        System.out.print("Enter the width: ");
        while (!acceptable2) {
            if ( myScanner.hasNextInt() ) { //checks if an input is an integer
                
                width = myScanner.nextInt();
                
                if ( width > 0 ) { //checks if integer is between 0 and 100
                    acceptable2 = true;
                    break;
                }
                else {
                    System.out.println("ERROR: the input must be greater than 0");
                    System.out.print("Enter the width: ");
                    myScanner.nextLine();
                }
            }
            else {
                System.out.println("ERROR: the input must be in the form of an integer");
                System.out.print("Enter the width: ");
                myScanner.nextLine();
                continue;
            }
        }

        int [] [] Matrix = randomMatrix( height, width );
        
        printMatrix( Matrix );
        System.out.println(" ");
        
        transposeMatrix( Matrix );
        System.out.println(" ");
        
        printMatrix( transposeMatrix (Matrix) );
    
    } //end of main method
    
    public static int [][] randomMatrix( int height, int width ) {
        
        int count1 = 0;
        int count2 = 0;
        int Matrix [] [] = new int [height] [width];
        for (count1 = 0; count1 < height; count1++) {
            for (count2 = 0; count2 < width; count2++ ) {
                Matrix [count1] [count2] = (int) (Math.random() * 21) - 10;
            }
        }
        
        return Matrix;
        
    } //end of randomMatrix Method
    
    public static void printMatrix( int [] [] Matrix ) {
        
        int i = 0;
        int j = 0;
        for ( i = 0; i < Matrix.length; i++ ) {
            for ( j = 0; j < Matrix[i].length; j++ ) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        int x = Matrix[0].length;
        for ( i = 0; i < Matrix.length; i++ ) {
            if (Matrix[i].length != x ) {
                System.out.println("This Matrix is not rectangular!!");
            }
        }
    }
    
    public static int [][] transposeMatrix( int [][] Matrix ) {
        
        
        int [][] Matrix2 = new int [Matrix[0].length] [Matrix.length];
        
        for (int x = 0; x < Matrix2.length; x++ ) {
            for (int y = 0; y < Matrix2[0].length; y++ ) {
                Matrix2[x][y] = Matrix[y][x];
            }
        }
        
        return Matrix2;
        
    }
    
} //end of class