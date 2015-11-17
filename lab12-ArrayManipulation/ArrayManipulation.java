/* The purpose of this lab is to become framiliar with manipulating multidemensional arrays
Joseph Inglis
11/15/15
lab 12 Array Manipulation
*/

public class ArrayManipulation {
    
    public static void main(String[] args) {
        
        int Array [] [] = new int [0] [0];
        Array = raggedArray();
        
        printArray( Array );
        System.out.println(" ");
        
        printArray( Array );
        System.out.println(" ");
        
        int smallestArray = findSmallest( Array );
        System.out.println("The array member with the smallest inner array was " + smallestArray );
        
        int largestValue = findLargest( Array );
        System.out.println("The largest value in the 2D array was " + largestValue );
        
        int evenValue = mostEven(Array );
        System.out.println("The array member with the most even numbers was " + evenValue );
        
    }//end of main method
    
    public static int [] [] raggedArray ( ) {
        
        int i = 0;
        int j = 0;
        int counti = (int) (Math.random() * 11) + 10;
        int countj = (int) (Math.random() * 11) + 10;
        int [] [] Array = new int [counti] [countj];
        
        for ( i = 0; i < counti; i++ ) {
            for ( j = 0; j < countj; j++ ) {
                Array [i] [j] = (int) (Math.random() * 2001) - 1000;
            }
        }
        
        return Array;
        
    }//end of raggedArray
    
    public static void printArray ( int [] [] Array ) {
        
        for ( int i = 0; i < Array.length; i++ ) {
            for ( int j = 0; j < Array[i].length; j++ ) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }//end of printArray Method
    
    public static void printArray ( int [] Array ) {
    
        for ( int j = 0; j < Array.length; j++ ) {
            System.out.print( Array[j] + " ");
        }
    } //end of printArray method
    
    public static int findSmallest( int [] [] Array ) {
        
        int small = 0;
        int x = Array.length;
        for ( int i = 1; i < Array.length; i++ ) {
            if (x > Array [i - 1].length) {
                small = i;
            }
        }
        return small;
        
    } //end of findSmallest Method
    
    public static int findLargest( int [] [] Array ) {
        
        int large = Array [0] [0];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if ( Array [i] [j] > large) {
                    Array [i] [j] = large;
                }
            }
        }
        
        return large;
    } //end of findLargest Method
    
    public static int mostEven( int [] [] Array ) {
        
        int x = 0;
        int even = 0;
        for (int i = 0; i < Array.length; i++) {
            int count = 0;
            for (int j = 0; j < Array[i].length; j++ ) {
                if ( (Array [i] [j] % 2) == 0 ) {
                    count++;
                }
            }
            if (count > x) {
                even = i;
            }
        }
        
        return even;
        
    } //end of mostEven Method
    
}//end of class