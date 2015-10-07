//Joseph Inglis
//CheckDigit

/*program uses loops to verify if an input is legit and if not it 
  will tell the usere the input is wrong and to input a new value.
  The program also is meant to use characters to represent numerical amounts*/

import java.util.Scanner;

//define a class
public class BarGraph {
    //main method
    public static void main(String[] args) {
        
    Scanner myScanner = new Scanner( System.in ); //declare instance of scanner
        
    double monday = 0;
    
    int a = 1;
    
    while (a == 1) {
        
        System.out.print("Expenses for monday: $"); 
        //prompt user for total expenses on monday
        
        monday = myScanner.nextDouble(); //accept user input for monday expenses
        
        if (monday >= 0) {
        a = 0;
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        }
    }
        
    double tuesday = 0;
    
    int b = 1;
    
    while (b == 1) {
        
        System.out.print("Expenses for tuesday: $"); 
        //prompt user for total expenses on tuesday
        
        tuesday = myScanner.nextDouble(); //accept user input for monday expenses
        
        if (tuesday >= 0) {
        b = 0;
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        }
    }
        
    double wednesday = 0;
    
    int c = 1;
    
    while (c == 1) {
        
        System.out.print("Expenses for wednesday: $"); 
        //prompt user for total expenses on wednesday
        
        wednesday = myScanner.nextDouble(); //accept user input for monday expenses
        
        if (wednesday >= 0) {
        c = 0;
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        }
    }
        
    double thursday = 0;
    
    int d = 1;
    
    while (d == 1) {
        
        System.out.print("Expenses for thursday: $"); 
        //prompt user for total expenses on thursday
        
        thursday = myScanner.nextDouble(); //accept user input for monday expenses
        
        if (thursday >= 0) {
        d = 0;
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        }
    }
        
    double friday = 0;
    
    int e = 1;
    
    while (e == 1) {
        
        System.out.print("Expenses for friday: $"); 
        //prompt user for total expenses on friday
        
        friday = myScanner.nextDouble(); //accept user input for monday expenses
        
        if (friday >= 0) {
        e = 0;
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        }
    }
        
    double saturday = 0;
    
    int f = 1;
    
    while (f == 1) {
        
        System.out.print("Expenses for saturday: $"); 
        //prompt user for total expenses on saturday
        
        saturday = myScanner.nextDouble(); //accept user input for monday expenses
        
        if (saturday >= 0) {
        f = 0;
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        }
    }
    
    double sunday = 0;
    
    int g = 1;
    
    while (g == 1) {
        
        System.out.print("Expenses for sunday: $"); 
        //prompt user for total expenses on sunday
        
        sunday = myScanner.nextDouble(); //accept user input for monday expenses
        
        if (sunday >= 0) {
        g = 0;
        }
        
        else {
        System.out.println("Not a valid integer, try again"); 
        }
    }

    //print bargraph for monday
    System.out.print("Expenses for monday:\t");
    
    int mondaycount; //initialize new variable before while loop
    mondaycount = 0; //set initial value
    //this will loop will print star every time day's expenses are greater than it
    while (mondaycount <= (monday - .5)) { //rounds number for making stars
        System.out.print("*"); //prints stars
        mondaycount++; //increments counter
    } //end of while statement
    
    System.out.println(" "); //print space
    
    //print bargraph for tuesday
    System.out.print("Expenses for tuesday:\t");
    
    int tuesdaycount; //initialize new variable before while loop
    tuesdaycount = 0; //set initial value
    //this will loop will print star every time day's expenses are greater than it
    while (tuesdaycount <= (tuesday - .5)) { //rounds number for making stars
        System.out.print("*"); //prints stars
        tuesdaycount++; //increments counter
    } //end of while statement
    
    System.out.println(" "); //prints space
    
     //print bargraph for wednesday
    System.out.print("Expenses for wednesday:\t");
    
    int wednesdaycount; //initialize new variable before while loop
    wednesdaycount = 0; //set initial value
    //this will loop will print star every time day's expenses are greater than it
    while (wednesdaycount <= (wednesday - .5)) { //rounds number for making stars
        System.out.print("*"); //prints stars
        wednesdaycount++; //increments counter
    } //end of while statement
    
    System.out.println(" "); //prints space
    
    //print bargraph for thursday
    System.out.print("Expenses for thursday:\t");
    
    int thursdaycount; //initialize new variable before while loop
    thursdaycount = 0; //set initial value
    //this will loop will print star every time day's expenses are greater than it
    while (thursdaycount <= (thursday - .5)) { //rounds number for making stars
        System.out.print("*"); //prints stars
        thursdaycount++; //increments counter
    } //end of while statement
    
    System.out.println(" "); //prints space
    
    //print bargraph for friday
    System.out.print("Expenses for friday:\t");
    
    int fridaycount; //initialize new variable before while loop
    fridaycount = 0; //set initial value
    //this will loop will print star every time day's expenses are greater than it
    while (fridaycount <= (friday - .5)) { //rounds number for making stars
        System.out.print("*"); //prints stars
        fridaycount++; //increments counter
    } //end of while statement
    
    System.out.println(" "); //prints space
    
    //print bar graph for saturday
    System.out.print("Expenses for saturday:\t");
    
    int saturdaycount; //initialize new variable before while loop
    saturdaycount = 0; //set initial value
    //this will loop will print star every time day's expenses are greater than it
    while (saturdaycount <= (saturday - .5)) { //rounds number for making stars
        System.out.print("*"); //prints stars
        saturdaycount++; //increments counter
    } //end of while statement
    
    System.out.println(" "); //prints space
    
    //print bar graph for sunday
    System.out.print("Expenses for sunday:\t");
    
    int sundaycount; //initialize new variable before while loop
    sundaycount = 0; //set initial value
    //this will loop will print star every time day's expenses are greater than it
    while (sundaycount <= (sunday - .5)) { //rounds number for making stars
        System.out.print("*"); //prints stars
        sundaycount++; //increments counter
    } //end of while statement
    
    System.out.println(" "); //prints space
    
    //calculate average cost of week
    double average;
    average = (monday + tuesday + wednesday + thursday + friday + saturday + sunday)/7;
    //calculates average total spending of one day
    
    double futureestimate;
    futureestimate = 0;
    
    double dayaverage;
    dayaverage = 0;
    
    int count;
    count = 0;
    
    while (count < 1456) {
    
        int randompercent = (int)(Math.random()*40) - 20;//randomly picks number between -20 and 20
    
        double percent;
        percent = randompercent/100;//turns random number into percent
        
        dayaverage = average + (dayaverage * percent);
        
        futureestimate = (futureestimate + dayaverage);
        count++;
    }
    
    //prints daily average
    System.out.print("Your average daily expenses are: $");
    System.out.printf("%.2f", dayaverage);
    System.out.println(" ");
    
    //prints estimate
    System.out.print("Your estimated expenditure for 4 years are: $");
    System.out.printf("%.2f", futureestimate);
    System.out.println(" ");
    
    }
}    