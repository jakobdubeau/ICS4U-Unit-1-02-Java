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

    /** Second half of speed of light equation.*/
    public static final double lSpeedSecond = Math.pow(10, 8);

    /** First half of speed of light equation.*/
    public static final double lSpeedFirst = 2.998;

    /** Variable that combines the two making the speed of light.*/
    public static final double lSpeedBoth = lSpeedFirst * lSpeedSecond;

    /** Variable of speed of light equation to the power of two, second half of e=mc^2.*/
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

        // user input.
        System.out.println("Enter the mass of an object in kilograms: ");

        try {
            // reads input.
            final float mass = myObj.nextFloat();

            final double energy = mass * lightSpeed;

            System.out.println(mass + "kg of mass would produce " + energy + "J of energy.");
        }

        catch (java.util.InputMismatchException errorCode) {
            System.out.println("Sorry, that was not a number.");
        }
        System.out.println("\nDone");
    }
}

