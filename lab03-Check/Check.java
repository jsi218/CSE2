//Joseph Inglis
//cyclometer
//
//use the scanner class to obtain cost of check, tip, and ways to split check

import java.util.Scanner;

//define a class
public class Check {
    //main method
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
    
    System.out.print("Enter the original cost of the check in the form xx.xx: "); 
    //prompt user for original coast of check
    
    double checkCost = myScanner.nextDouble(); //accept user input for check
    //use "nextint" for inputing integer values
    
    System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):" );
    //prompt user for tip
    
    double tipPercent = myScanner.nextDouble(); //accept user input for tip
    
    tipPercent /= 100; //convert to into decimal value
    
    System.out.print("Enter the number of people who went out to dinner: ");
    // prompt user for number of people in party
    
    int numPeople = myScanner.nextInt();
    
    //output variables
    
    double totalCost;
    double costPerPerson;
    int dollars, dimes, pennies; //for calculating cost
    totalCost = checkCost * (1 + tipPercent); //calculate total cost
    costPerPerson = totalCost / numPeople; //calculate cost per person
    dollars = (int)costPerPerson; //calculates dollars people pay
    dimes = (int)(costPerPerson * 10) % 10; //calculates dimes people pay
    pennies = (int)(costPerPerson * 100) % 10; //calculates pennies people pay
    
    System.out.println("Each person in the group owes $" + dollars +'.'
                        + dimes + pennies); //print cost per person
    
    } //end of main method
} //end of class