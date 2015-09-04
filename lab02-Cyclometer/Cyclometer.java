//Joseph Inglis
//cyclometer
//
//  a) print # of minutes for each trip
//  b) print # of counts for each trip
//  c) print distance of each trip in miles
//  d) print the combined distance of both trips

//define a class
public class Cyclometer {
    //main method
    public static void main(String[] args) {
        
    //our input variables
        
    int secsTrip1=480; //time of trip 1
    int secsTrip2=3220; //time of trip 2
    int countsTrip1=1561; //counts of trip 1
    int countsTrip2=9037; //counts of trip 2
    
    //our intermediate variables and output data
    
    double wheelDiameter=27.0; //diameter of wheel
    double PI=3.14159; //value of pi
    double feetPerMile=5280; //how many feet are in a mile
    double inchesPerFoot=12; //how many inches are in a foot
    double secondsPerMinute=60; //how many seconds are in a minute
    double distanceTrip1, distanceTrip2, totalDistance; //values of distances that we are traveling

    // printing values of time and counts
    
    System.out.println("Trip 1 took "+ 
        (secsTrip1/secondsPerMinute)+ " minutes and had "+
        countsTrip1+" counts.");
        
    System.out.println("Trip 2 took "+ 
        (secsTrip2/secondsPerMinute)+ " minutes and had "+
        countsTrip2+" counts.");
        
    //compute values of distances
    
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // calculates distance for trip 1 in inches
    distanceTrip1/=inchesPerFoot*feetPerMile;
    //calculates distance for trip 1 in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI;
    // calculates distance for trip 2 in inches
    distanceTrip2/=inchesPerFoot*feetPerMile;
    //calculates distance for trip 2 in miles
    totalDistance=distanceTrip1+distanceTrip2;
    //calculates total distance
    
    //print out the distances
    
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+ totalDistance +" miles");
    
    }//end of main method
} // end of class