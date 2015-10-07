//Joseph Inglis
//CheckDigit

import java.util.Scanner;

//define a class
public class CheckDigit {
    //main method
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    int a;
    a = 0;
    
    String BarCodestring = "abc";
    
    while (a == 0) {

        System.out.println("Enter 10 digit code: ");
    
        BarCodestring = myScanner.next();//accept bar code
        
        if (BarCodestring.length() != 10 ) {
            System.out.println("Barcode is not 10 digits");
            continue;
        }
        else {
            a = 1;
        }
    }
    
    int Barcode = Integer.parseInt(BarCodestring);
    
    //when I converted the string to an integer I changed the 
    //name of the storage variable
    
    int Checker;
    int Digit2;
    int Digit3;
    int Digit4;
    int Digit5;
    int Digit6;
    int Digit7;
    int Digit8;
    int Digit9;
    int Digit10;
    
    int Total;
    
    int CorrectChecker;
    
    //outputvariables
    Checker = Barcode % 10;
    Digit2 = (int) ((Barcode % 100)/10);
    Digit3 = (int) ((Barcode % 1000)/100);
    Digit4 = (int) ((Barcode % 10000)/1000);
    Digit5 = (int) ((Barcode % 100000)/10000);
    Digit6 = (int) ((Barcode % 1000000)/100000);
    Digit7 = (int) ((Barcode % 10000000)/1000000);
    Digit8 = (int) ((Barcode % 100000000)/10000000);
    Digit9 = (int) ((Barcode % 1000000000)/100000000);
    Digit10 = (int) (Barcode/(100000*1000000));
    
    Total = (Digit2 * 2) + (Digit3 * 3) + (Digit4 * 4) + (Digit5 * 5) + (Digit6 * 6) + (Digit7 * 7) + (Digit8 * 8) + (Digit9 * 9) + (Digit10 * 10);
    
    CorrectChecker = (Total % 11);
    
    if (CorrectChecker == Checker) {
        System.out.println("Your barcode is valid");
    }
    else {
        System.out.println("Your barcode is invalid");
        System.out.println("The correct checker digit is " + CorrectChecker);
    }
    }
}