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
    int inputValue = 10;
    int myFactor;
    
    System.out.print("While Loop:");
   
    while ( inputValue < 100 ) {
        inputValue++;
        myFactor = 2;
        while ( myFactor <= inputValue ) {
            if ( inputValue == myFactor ) {
                System.out.print(" " + inputValue );
                break;
            }
            if ( inputValue % myFactor == 0 ) {
                break;
            }
        myFactor++;
        }
    }
    
    System.out.println(" ");

//Step 2 (for loop)
    System.out.print("For Loop:");
    
    for (inputValue = 10; inputValue < 100; inputValue++ ) {

        for ( myFactor = 2; myFactor <= inputValue; myFactor++ ) {
            if ( inputValue == myFactor ) {
                System.out.print(" " + inputValue );
                break;
            }
            if ( inputValue % myFactor == 0 ) {
                break;
            }
        }
    }
    
    System.out.println(" ");
    
//step 2 (do-while loop)
    System.out.print("Do-While Loop:");
    
    inputValue = 10;
    
    do {
        inputValue++;
        myFactor = 2;
        do {
            if ( inputValue == myFactor ) {
                System.out.print(" " + inputValue );
                break;
            }
            if ( inputValue % myFactor == 0 ) {
                break;
            }
        myFactor++;
        } while ( myFactor <= inputValue );
    } while ( inputValue < 100 );
    
    System.out.println(" ");
    
//step 3
    int facenumber = (int)(Math.random()*196) + 5;
    int countface = 1;
    
    while (countface <= facenumber ) {
        if ( (countface % 20) == 0 ) {
            System.out.println("^ ");
        }
        else {
            System.out.print("^ ");
        }
    countface++;    
    }
    
    System.out.println(" ");
        
    }
}