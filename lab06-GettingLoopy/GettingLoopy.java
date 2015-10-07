/* The purpose of this lab is to become framiliar with loops
Josph Inglis
10/3/15
Lab #6
*/

//define a class
public class GettingLoopy {
    //main method
    public static void main(String[] args) {
        
//Step 1
    int count = 0;
    int number = 1;
    while ( count < 13 ) {
        if ( number == 7) {
            System.out.print(number);
            count++;
        }
        else {
            System.out.print(number);
            count++;
            number++;
        }
    }
    System.out.println(" ");

    
//Step 2 (while loop)
    int myFactor = 2;
    int inputValue = 10;
   
    while ( inputValue < 100 ) {
    inputValue++;     
        while ( inputValue > myFactor ) {
            if ( inputValue % myFactor == 0 ) {
                break;
            }
            myFactor++;
        }
    System.out.println(inputValue);
    }
    


    }}