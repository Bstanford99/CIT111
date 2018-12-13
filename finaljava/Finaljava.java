package finaljava;

import java.util.Scanner;

/**
 *
 * @author brandon.stanford
 */
public class Finaljava {

    public static void main(String[] args) {
        System.out.println("Welcome to the database of Jupiter's Moons. Please type in europa, ganymede, callisto, io, lysithea, or autonoe to display facts.");
        
      
        
        NewMoon europa = new NewMoon();
        europa.moonName = "europa";
        europa.diameter = 2120;
        europa.discoveryYear = 1610;
        europa.distance = 414000;
// facts of europa
        NewMoon ganymede = new NewMoon();
        ganymede.diameter = 5268;
        ganymede.discoveryYear = 1610;
        ganymede.distance = 665000;
//facts of ganymede
        NewMoon callisto = new NewMoon();
        callisto.diameter = 4820;
        callisto.discoveryYear = 1610;
        callisto.distance = 1116000;
// facts of callisto
        NewMoon io = new NewMoon();
        io.diameter = 3642;
        io.discoveryYear = 1610;
        io.distance = 422000;
// facts of io
        NewMoon lysithea = new NewMoon();
        lysithea.diameter = 36;
        lysithea.discoveryYear = 1938;
        lysithea.distance = 11700000;
// facts of lysithea
        NewMoon autonoe = new NewMoon();
        autonoe.diameter = 4;
        autonoe.discoveryYear = 2001;
        autonoe.distance = 31600000;
//facts of autonoe
        String enteredMoon;

        Scanner userInputScanner = new Scanner(System.in);

        enteredMoon = userInputScanner.next();
        if (enteredMoon.equals(europa.moonName)) {
            System.out.println("Diameter" + europa.diameter);
            System.out.println("Discovery Year" + europa.discoveryYear);
            System.out.println("Distance" + europa.distance);
        
        } else {
            
        }
        if (enteredMoon.equals(ganymede.moonName)) {
            System.out.println("Diameter" + ganymede.diameter);
            System.out.println("Discovery Year" + ganymede.discoveryYear);
            System.out.println("Distance" + ganymede.distance);
        
        } else {
            
        }
        if (enteredMoon.equals(callisto.moonName)) {
            System.out.println("Diameter" + callisto.diameter);
            System.out.println("Discovery Year" + callisto.discoveryYear);
            System.out.println("Distance" + callisto.distance);
        
        } else {
            
        }
        if (enteredMoon.equals(io.moonName)) {
            System.out.println("Diameter" + io.diameter);
            System.out.println("Discovery Year" + io.discoveryYear);
            System.out.println("Distance" + io.distance);
        } else {
        }
            if (enteredMoon.equals(lysithea.moonName)) {
                System.out.println("Diameter" + lysithea.diameter);
                System.out.println("Discovery Year" + lysithea.discoveryYear);
                System.out.println("Distance" + lysithea.distance);
            
            } else {
            }
            if (enteredMoon.equals(autonoe.moonName)) {
                System.out.println("Diameter" + autonoe.diameter);
                System.out.println("Discovery Year" + autonoe.discoveryYear);
                System.out.println("Distance" + autonoe.distance);
           
            } else {
                
        }
    }
}
