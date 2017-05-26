package wong.andrew;

import java.util.BitSet;

/**
 * Created by andrewwong on 5/26/17.
 */
public class LightSwitcher {
    /**
     * Take a given input of switches, and the switches to turn on, and return the new state of the switches.
     * NOTE: If the initial state of a switch is already turned on, do not turn it off.
     */
    public static int turnOnSwitches(int switches, int switchesToTurnOn) {
        return 0;
    }

    /**
     * Take a given input of switches and turn them all to on.
     * Remember to use bit notation (0bxxxxxxxx) and a bit operator.
     */
    public static int turnOnAllSwitches(int switches) {
        return 0;

    }

    /**
     * Take a given input of switches and the switches to turn off, and return the new state of the switches.
     * NOTE: If a switch is already off, do not turn it on.
     * And a '1' in a position in 'switchesToTurnOff' means to turn that switch to off.
     */
    public static int turnOffSwitches(int switches, int switchesToTurnOff) {
        return 0;

    }

    /**
     * Take a given input of switches and turn them all off.
     * Remember to use bit notation and a bit operator.
     */
    public static int turnOffAllSwitches(int switches) {
        return 0;

    }

    /**
     * Take a given input of switches and the switches to flip, and return the new state of the switches.
     * NOTE: Wherever there is a '1' in switchesToFlip, flip the state of that switch in switches.
     * I.E switches = 1 0 1 and switchesToFlip = 1 1 0 should return 0 1 1.
     */
    public static int flipSwitches(int switches, int switchesToFlip) {
        return 0;

    }

    /**
     * Take a given input of switches and flip them all.
     * NOTE: An integer has more than 8 bits, so find a way to only return the rightmost 8 bits.
     */
    public static int flipAllSwitches(int switches) {
        return 0;

    }

    /**
     * Return the state of a switch in a given position.
     * Count switches from 0, and from right to left.
     * So, a byte reads 76543210
     */
    public static int getSwitchPositionAt(int switches, int position) {
        return 0;

    }

    /**
     * Move all the the bits to the right `count` places.
     */
    public static int moveRightBy(int switches, int count) {
        return 0;

    }

    /**
     * Move all the the bits to the left `count` places.
     * NOTE: An integer has more than 8 bits, so find a way to only return the rightmost 8 bits.
     */
    public static int moveLeftBy(int switches, int count){
        return 0;

    }

    /**
     * This is written for you to help with debugging.  If you call System.out.println(viewSwitches(switches)),
     * you can see the rightmost 8 bits of a given integer.
     */
    public static String viewSwitches(int switches) {

        return String.format("%8s", Integer.toBinaryString((switches & 0b11111111))).replace(' ', '0');
    }
    public static BitSet fromString(final String s) {
        return BitSet.valueOf(new long[] { Long.parseLong(s, 2) });
    }
}
