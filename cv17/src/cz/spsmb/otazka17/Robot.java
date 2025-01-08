package cz.spsmb.otazka17;

/**
 * Robot class
 */

public class Robot {
    /**
     * Move
     * @param distance
     */
    public static void move(double distance) {
        System.out.println("I am moving " + distance);
    }

    /**
     * Work
     */
    public static void work() {
        System.out.println("I am working");
    }

    /**
     * Turn on
     */
    public static void turnOn() {
        System.out.println("I am turning on");
    }

    /**
     * Turn off
     */
    public static void turnOff() {
        System.out.println("I am turning off");
    }
}
