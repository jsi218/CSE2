/* The purpose of this lab is to use arrays and seperate methods to shuffle a 
    deck of cards and randomly draw a 5 card hand
Joseph Inglis
11/1/15
hw10 Shuffing
*/

import java.util.Scanner;

public class Shuffling{
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    String[] suitNames={"C","H","S","D"};
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    
    for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
    }
    
    printArray(cards);
    shuffle(cards);
    //printArray(cards);
    randomizeHand(cards);
    //printArray(hand);
    
    } //end of main method 
    
    public static void printArray( String [] list ) {
        
        for (int i =0; i < list.length; i++ ) {
            System.out.print( list[i] + " ");
        }
    } //end of printArray method
    
    public static void shuffle( String [] list ) {
        
        System.out.println(" ");
        System.out.println("Cards Shuffled");
        
        for (int i =0; i < list.length; i++ ) {
            int x = (int) ( list.length * Math.random() );
            String temp = list[x];
            list[x] = list[i];
            list[i] = temp;
            System.out.print( list[i] + " ");
        }
    } //end of shuffle method
    
     public static void randomizeHand( String [] list ) {
        
        System.out.println("5 Card Hand");
        
        for (int i =0; i < list.length; i++ ) {
            int x = (int) ( 52 * Math.random() );
            String temp = list[x];
            list[x] = list[i];
            list[i] = temp;
        }
        for (int j = 0; j < 5; j++) {
            System.out.print( list[j] + " ");
        }
    } //end of randomizeHand method
    
} //end of class