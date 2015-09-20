//Joseph Inglis
//Card Generator
//
//use random number generator and if statement to pick a card, 
//assign a siut name, 
//assign an identity
//print name of card

import java.util.Scanner; //there is no input so I must add a scanner

//define a class
public class CardGenerator {
    //main method
    public static void main(String[] args) {
        
    int Card = (int)(Math.random()*52) + 1; //randomly picks number from 1-52
    
    switch ( Card ) {
        case 1:
            System.out.println("You picked the Ace of hearts");
            break;
        case 2:
            System.out.println("You picked the 2 of hearts");
            break;
        case 3:
            System.out.println("You picked the 3 of hearts");
            break;
        case 4:
            System.out.println("You picked the 4 of hearts");
            break;
        case 5:
            System.out.println("You picked the 5 of hearts");
            break;
        case 6:
            System.out.println("You picked the 6 of hearts");
            break;    
        case 7:
            System.out.println("You picked the 7 of hearts");
            break;
        case 8:
            System.out.println("You picked the 8 of hearts");
            break;
        case 9:
            System.out.println("You picked the 9 of hearts");
            break;
        case 10:
            System.out.println("You picked the 10 of hearts");
            break;
        case 11:
            System.out.println("You picked the Jack of hearts");
            break;
        case 12:
            System.out.println("You picked the Queen of hearts");
            break;
        case 13:
            System.out.println("You picked the King of hearts");
            break;
        case 14:
            System.out.println("You picked the Ace of diamonds");
            break;
        case 15:
            System.out.println("You picked the 2 of diamonds");
            break;
        case 16:
            System.out.println("You picked the 3 of diamonds");
            break;
        case 17:
            System.out.println("You picked the 4 of diamonds");
            break;
        case 18:
            System.out.println("You picked the 5 of diamonds");
            break;
        case 19:
            System.out.println("You picked the 6 of diamonds");
            break;    
        case 20:
            System.out.println("You picked the 7 of diamonds");
            break;
        case 21:
            System.out.println("You picked the 8 of diamonds");
            break;
        case 22:
            System.out.println("You picked the 9 of diamonds");
            break;
        case 23:
            System.out.println("You picked the 10 of diamonds");
            break;
        case 24:
            System.out.println("You picked the Jack of diamonds");
            break;
        case 25:
            System.out.println("You picked the Queen of diamonds");
            break;
        case 26:
            System.out.println("You picked the King of diamonds");
            break;   
        case 27:
            System.out.println("You picked the Ace of clubs");
            break;
        case 28:
            System.out.println("You picked the 2 of clubs");
            break;
        case 29:
            System.out.println("You picked the 3 of clubs");
            break;
        case 30:
            System.out.println("You picked the 4 of clubs");
            break;
        case 31:
            System.out.println("You picked the 5 of clubs");
            break;
        case 32:
            System.out.println("You picked the 6 of clubs");
            break;    
        case 33:
            System.out.println("You picked the 7 of clubs");
            break;
        case 34:
            System.out.println("You picked the 8 of clubs");
            break;
        case 35:
            System.out.println("You picked the 9 of clubs");
            break;
        case 36:
            System.out.println("You picked the 10 of clubs");
            break;
        case 37:
            System.out.println("You picked the Jack of clubs");
            break;
        case 38:
            System.out.println("You picked the Queen of clubs");
            break;
        case 39:
            System.out.println("You picked the King of clubs");
            break;
        case 40:
            System.out.println("You picked the Ace of spades");
            break;
        case 41:
            System.out.println("You picked the 2 of spades");
            break;
        case 42:
            System.out.println("You picked the 3 of spades");
            break;
        case 43:
            System.out.println("You picked the 4 of spades");
            break;
        case 44:
            System.out.println("You picked the 5 of spades");
            break;
        case 45:
            System.out.println("You picked the 6 of spades");
            break;    
        case 46:
            System.out.println("You picked the 7 of spades");
            break;
        case 47:
            System.out.println("You picked the 8 of spades");
            break;
        case 48:
            System.out.println("You picked the 9 of spades");
            break;
        case 49:
            System.out.println("You picked the 10 of spades");
            break;
        case 50:
            System.out.println("You picked the Jack of spades");
            break;
        case 51:
            System.out.println("You picked the Queen of spades");
            break;
        case 52:
            System.out.println("You picked the King of spades");
            break;    
        } //end of switch statement    
    } //end of main method
} //end of class