//Joseph Inglis
//Arithmetic
//
//calculate and print cost of each item; sales tax for that total cost
//calculate and print total cost of purchases (before tax)
//calculate and print total cost of transaction (total with tax)

//define a class
public class Arithmetic {
    //main method
    public static void main(String[] args) {
    
    //input variables
    
    int nSocks=3; //number of pairs of socks
    double sockCost$=2.58; //cost per pair of socks
    
    int nGlasses=6; //number of drinking glasses
    double glassCost$=2.29; //cost per glass
    
    int nEnvelopes=1; //number of envelopes
    double envelopeCost$=3.25; //cost per envelope
    
    double taxPercent=0.06; //percent of cost added as tax
    
    //output data
    
    double totalSockCost$; //total cost of socks
    double totalGlassCost$; //total cost of drinking glasses
    double totalEnvelopeCost$; //total cost of envelopes
    double SalesTaxSocks$; //sales tax of socks
    double SalesTaxGlass$; //sales tax of glass
    double SalesTaxEnvelopes$; //sales tax of envelopes
    
    double totalPurchase$; //total cost of purchase
    
    totalSockCost$=nSocks*sockCost$; //calculates total cost of socks
    totalGlassCost$=nGlasses*glassCost$; //calculates total cost of socks
    totalEnvelopeCost$=nEnvelopes*envelopeCost$; //calculates total cost of socks
    
    SalesTaxSocks$= (double) ( ((int) (totalSockCost$*taxPercent*100)))/100; //calculates sales tax for socks
    SalesTaxGlass$= (double) ( ((int) (totalGlassCost$*taxPercent*100)))/100; //calculates sales tax for glasss
    SalesTaxEnvelopes$= (double) (( (int) (totalEnvelopeCost$*taxPercent*100)))/100; //calculates sales tax for envelopes
    
    totalPurchase$= (double) ( ((int) ((totalSockCost$ +totalGlassCost$ + totalEnvelopeCost$ +
        SalesTaxSocks$ + SalesTaxGlass$ + SalesTaxEnvelopes$)*1000)))/1000; // calculates total cost of purchase
        
    //print costs and sales tax for each item
    
    System.out.println("the total cost of socks was $"+totalSockCost$+
        " and the sales tax was $"+SalesTaxSocks$); //print total cost and sales tax of socks
        
    System.out.println("the total cost of drinking glasses was $"+totalGlassCost$+
        " and the sales tax was $"+SalesTaxGlass$); //print total cost and sales tax of glasses
        
    System.out.println("the total cost of envelopes was $"+totalEnvelopeCost$+
        " and the sales tax was $"+SalesTaxEnvelopes$); //print total cost and sales tax of envelopes
        
    //print total cost (before tax)
    
    System.out.println("the total cost of purchases was $"+ (totalSockCost$ + 
        totalGlassCost$ + totalEnvelopeCost$)); //print total cost of purchases
        
    //print total transaction (after tax)
    
    System.out.println("the total cost of the transaction was $"+ (totalPurchase$)); //print total transaction
        
    }

}