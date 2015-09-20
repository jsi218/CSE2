//Joseph Inglis
//Poker
//
//use random number generator
//pick 5 random cards from a deck
//determine if you have pair, two-pair, three-of-a-kind, or a high card

import java.util.Scanner; //there is no input so I must add a scanner

//define a class
public class PokerHandCheck {
    //main method
    public static void main(String[] args) {
        
    int Card1 = (int)(Math.random()*52) + 1; //randomly picks number from 1-52
    int Card2 = (int)(Math.random()*52) + 1; //randomly picks number from 1-52
    int Card3 = (int)(Math.random()*52) + 1; //randomly picks number from 1-52
    int Card4 = (int)(Math.random()*52) + 1; //randomly picks number from 1-52
    int Card5 = (int)(Math.random()*52) + 1; //randomly picks number from 1-52
    
    switch ( Card1 ) {
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
        
    switch ( Card2 ) {
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
        
    switch ( Card3 ) {
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
        
    switch ( Card4 ) {
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
        
    switch ( Card5 ) {
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
    
    switch (Card1 % 13) { //switch statement for determining card1 "number"
        case 1: Card1 = 1; //card is ace
        break;
        case 2: Card1 = 2; //card is 2
        break;
        case 3: Card1 = 3; //card is 3
        break;
        case 4: Card1 = 4; //card is 4
        break;
        case 5: Card1 = 5; //card is 5
        break;
        case 6: Card1 = 6; //card is 6
        break;
        case 7: Card1 = 7; //card is 7
        break;
        case 8: Card1 = 8; //card is 8
        break;
        case 9: Card1 = 9; //card is 9
        break;
        case 10: Card1 = 10; //card is 10
        break;
        case 11: Card1 = 11; //card is jack
        break;
        case 12: Card1 = 12; //card is queen
        break;
        case 0: Card1 = 13; //card is king
        break;
    } //end of switch statement
    
    switch (Card2 % 13) { //switch statement for determining card2 "number"
        case 1: Card2 = 1; //card is ace
        break;
        case 2: Card2 = 2; //card is 2
        break;
        case 3: Card2 = 3; //card is 3
        break;
        case 4: Card2 = 4; //card is 4
        break;
        case 5: Card2 = 5; //card is 5
        break;
        case 6: Card2 = 6; //card is 6
        break;
        case 7: Card2 = 7; //card is 7
        break;
        case 8: Card2 = 8; //card is 8
        break;
        case 9: Card2 = 9; //card is 9
        break;
        case 10: Card2 = 10; //card is 10
        break;
        case 11: Card2 = 11; //card is jack
        break;
        case 12: Card2 = 12; //card is queen
        break;
        case 0: Card2 = 13; //card is king
        break;
    } //end of switch statement
    
    switch (Card3 % 13) { //switch statement for determining card3 "number"
        case 1: Card3 = 1; //card is ace
        break;
        case 2: Card3 = 2; //card is 2
        break;
        case 3: Card3 = 3; //card is 3
        break;
        case 4: Card3 = 4; //card is 4
        break;
        case 5: Card3 = 5; //card is 5
        break;
        case 6: Card3 = 6; //card is 6
        break;
        case 7: Card3 = 7; //card is 7
        break;
        case 8: Card3 = 8; //card is 8
        break;
        case 9: Card3 = 9; //card is 9
        break;
        case 10: Card3 = 10; //card is 10
        break;
        case 11: Card3 = 11; //card is jack
        break;
        case 12: Card3 = 12; //card is queen
        break;
        case 0: Card3 = 13; //card is king
        break;
    } //end of switch statement
    
    switch (Card4 % 13) { //switch statement for determining card4 "number"
        case 1: Card4 = 1; //card is ace
        break;
        case 2: Card4 = 2; //card is 2
        break;
        case 3: Card4 = 3; //card is 3
        break;
        case 4: Card4 = 4; //card is 4
        break;
        case 5: Card4 = 5; //card is 5
        break;
        case 6: Card4 = 6; //card is 6
        break;
        case 7: Card4 = 7; //card is 7
        break;
        case 8: Card4 = 8; //card is 8
        break;
        case 9: Card4 = 9; //card is 9
        break;
        case 10: Card4 = 10; //card is 10
        break;
        case 11: Card4 = 11; //card is jack
        break;
        case 12: Card4 = 12; //card is queen
        break;
        case 0: Card4 = 13; //card is king
        break;
    } //end of switch statement
    
    switch (Card5 % 13) { //switch statement for determining card5 "number"
        case 1: Card5 = 1; //card is ace
        break;
        case 2: Card5 = 2; //card is 2
        break;
        case 3: Card5 = 3; //card is 3
        break;
        case 4: Card5 = 4; //card is 4
        break;
        case 5: Card5 = 5; //card is 5
        break;
        case 6: Card5 = 6; //card is 6
        break;
        case 7: Card5 = 7; //card is 7
        break;
        case 8: Card5 = 8; //card is 8
        break;
        case 9: Card5 = 9; //card is 9
        break;
        case 10: Card5 = 10; //card is 10
        break;
        case 11: Card5 = 11; //card is jack
        break;
        case 12: Card5 = 12; //card is queen
        break;
        case 0: Card5 = 13; //card is king
        break;
    } //end of switch statement
    
    if ( Card1 == Card2 && Card2 == Card3 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    }
    else if ( Card1 == Card2 && Card2 == Card4 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    }
    else if ( Card1 == Card2 && Card2 == Card5 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    }   
    else if ( Card1 == Card3 && Card3 == Card4 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    }   
    else if ( Card1 == Card3 && Card3 == Card5 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    } 
    else if ( Card1 == Card4 && Card4 == Card5 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    }
    else if ( Card2 == Card3 && Card3 == Card4 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    }    
    else if ( Card2 == Card3 && Card3== Card5 ) { 
        System.out.println("You have three of a kind"); //test for three of a kind
    }    
    else if ( Card3 == Card4 && Card4 == Card5 ) {
        System.out.println("You have three of a kind"); //test for three of a kind
    }
    else if ( Card1 == Card2 && Card3 == Card4 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if ( Card1 == Card2 && Card3 == Card5 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if ( Card1 == Card3 && Card2 == Card4 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if ( Card1 == Card3 && Card2 == Card5 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if ( Card1 == Card4 && Card2 == Card3 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if ( Card1 == Card4 && Card2 == Card5 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if ( Card1 == Card5 && Card2 == Card3 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if ( Card1 == Card5 && Card2 == Card4 ) {
        System.out.println("You have two pair"); //test for 2 pair
    }
    else if (Card1 == Card2) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card1 == Card3) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card1 == Card4) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card1 == Card5) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card2 == Card3) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card2 == Card4) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card2 == Card5) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card3 == Card4) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card3 == Card5) {
        System.out.println("You have a pair"); //test for a pair
    }
    else if (Card4 == Card5) {
        System.out.println("You have a pair"); //test for a pair
    }
    else {
        System.out.println("You a high card hand"); //high card hand
    }
    
    } //end of main method
} //end of class