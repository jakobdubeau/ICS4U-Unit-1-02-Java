/*
*
* The Einstein program lets the user enter the mass of an object
* and then sees how much energy could be released from that object.
*
* @author Jakob
* @version 1.0
* @since 2020-11-24
* Class Einstein
*/

import java.util.Scanner;

/**
* Einstein program calculates energy released from an object using inputted mass and speed of
* light equation.
*/
final class Einstein {

    /** Second half of speed of light equation.*/
    public static final double SPEED_SECOND = Math.pow(10, 8);

    /** First half of speed of light equation.*/
    public static final double SPEED_FIRST = 2.998;

    /** Variable that combines the two making the speed of light.*/
    public static final double SPEED_BOTH = SPEED_FIRST * SPEED_SECOND;

    /** Variable of speed of light equation to the power of two, second half of e=mc^2.*/
    static final double LIGHT_SPEED = Math.pow(SPEED_BOTH, 2);

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

            final double energy = mass * LIGHT_SPEED;

            System.out.println(mass + "kg of mass would produce " + energy + "J of energy.");
        }

        catch (java.util.InputMismatchException errorCode) {
            System.out.println("Sorry, that was not a number.");
        }
        System.out.println("\nDone");
    }
}

