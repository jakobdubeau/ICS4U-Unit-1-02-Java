/*

* The Einstein program lets the user enter the mass of an object
* and then sees how much energy could be released from that object.
*
* @author Jakob
* @version 1.0
* @since 2020-11-24
* Class Einstein
*/

import java.util.Scanner;

final class Einstein {

public static final double lSpeedSecond = Math.pow(10, 8);

public static final double lSpeedFirst = 2.998;

public static final double lSpeedBoth = lSpeedFirst * lSpeedSecond;

    static final double lightSpeed = (Math.pow(lSpeedBoth, 2));

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

private Einstein() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting function.
    *
    * @param args No args will be used
    *
    */

    public static void main(final String[] args) {

    // variables.
    final double energyOut;

    final Scanner myObj = new Scanner(System.in);

    //user input
    System.out.println("Enter the mass of an object in kilograms: ");

    try {
        final float Mass = myObj.nextFloat();

        double energy = Mass * lightSpeed;

        System.out.println(Mass + "kg of mass would produce " + energy + "J of energy.");

        System.out.println("\nDone");
    }

    catch (java.util.InputMismatchException errorCode) {
        System.out.println("Sorry, that was not a number.");
        System.out.println("\nDone");  
    }
 }
}

