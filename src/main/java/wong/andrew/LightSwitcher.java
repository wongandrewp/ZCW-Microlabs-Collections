package wong.andrew;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;

/**
 * Created by andrewwong on 5/26/17.
 */
public class LightSwitcher {
    /**
     * Take a given input of switches, and the switches to turn on, and return the new state of the switches.
     * NOTE: If the initial state of a switch is already turned on, do not turn it off.
     */

    public static BitSet turnOnSwitches(BitSet switches, BitSet switchesToTurnOn) {
        int lastBitIndex = findLastBitIndex(switches);
        BitSet switchesClone = (BitSet) switches.clone();
        for (int i = lastBitIndex; i >= 0; i--) {
            // conditional statement comparing switches[i] with switchesToTurnOn[i]
            if (switchesToTurnOn.get(i)) {
                switchesClone.set(i);
            }
        }
        return switchesClone;
    }

    public static int findLastBitIndex(BitSet switches) {
        return switches.size()/8 - 1;
    }

    /**
     * Take a given input of switches and turn them all to on.
     * Remember to use bit notation (0bxxxxxxxx) and a bit operator.
     */
    public static BitSet turnOnAllSwitches(BitSet switches) {
        if (switches.length() == 0) {
            return fromString("11111111");
        }
        int lastBitIndex = findLastBitIndex(switches);
        BitSet switchesClone = (BitSet) switches.clone();
        for (int i = lastBitIndex; i >= 0; i--) {

            switchesClone.set(i);

        }
        return switchesClone;
    }

    /**
     * Take a given input of switches and the switches to turn off, and return the new state of the switches.
     * NOTE: If a switch is already off, do not turn it on.
     * And a '1' in a position in 'switchesToTurnOff' means to turn that switch to off.
     */
    public static BitSet turnOffSwitches(BitSet switches, BitSet switchesToTurnOff) {
        int lastBitIndex = findLastBitIndex(switches);
        BitSet switchesClone = (BitSet) switches.clone();
        for (int i = lastBitIndex; i >= 0; i--) {
            if (switchesToTurnOff.get(i)) {
                switchesClone.clear(i);
            }
        }
        return switchesClone;

    }

    /**
     * Take a given input of switches and turn them all off.
     * Remember to use bit notation and a bit operator.
     */
    public static BitSet turnOffAllSwitches(BitSet switches) {
        return new BitSet(0);

    }

    /**
     * Take a given input of switches and the switches to flip, and return the new state of the switches.
     * NOTE: Wherever there is a '1' in switchesToFlip, flip the state of that switch in switches.
     * I.E switches = 1 0 1 and switchesToFlip = 1 1 0 should return 0 1 1.
     */
    public static BitSet flipSwitches(BitSet switches, BitSet switchesToFlip) {
        int lastBitIndex = findLastBitIndex(switches);
        BitSet switchesClone = (BitSet) switches.clone();
        for (int i = lastBitIndex; i >= 0; i--) {
            if (switchesToFlip.get(i)) {
                flipSwitch(switchesClone, i);
            }
        }
        return switchesClone;
    }

    /**
     * Take a given input of switches and flip them all.
     * NOTE: An integer has more than 8 bits, so find a way to only return the rightmost 8 bits.
     */
    public static BitSet flipAllSwitches(BitSet switches) {
        if (switches.equals(fromString("0"))) {
            return fromString("11111111");
        }
        int lastBitIndex = findLastBitIndex(switches);
        BitSet switchesClone = (BitSet) switches.clone();
        for (int i = lastBitIndex; i >= 0; i--) {
            flipSwitch(switchesClone, i);
        }
        return switchesClone;

    }

    private static void flipSwitch(BitSet subSwitches, int index) {
        if (subSwitches.get(index)) {
            subSwitches.clear(index);
        } else {
            subSwitches.set(index);
        }
    }

    /**
     * Return the state of a switch in a given position.
     * Count switches from 0, and from right to left.
     * So, a byte reads 76543210
     */
    public static int getSwitchPositionAt(BitSet switches, int position) {
        if (switches.get(position)) {
            return 1;
        } else {
            return 0;
        }

    }

    /**
     * Move all the the bits to the right `count` places.
     */
    public static BitSet moveRightBy(BitSet switches, int count) {
        if(count==switches.length()){
            return fromString("0");
        }

        BitSet cloneSet = (BitSet) switches.clone();
        cloneSet.clear(findLastBitIndex(switches) - count, findLastBitIndex(switches) + 1);
        for(int i = 0; i <= findLastBitIndex(switches) - count; i++){
            boolean origValue = switches.get(count + i);
            cloneSet.set(i, origValue);
        }
        return cloneSet;
    }


    /**
     * Move all the the bits to the left `count` places.
     * NOTE: An integer has more than 8 bits, so find a way to only return the rightmost 8 bits.
     */
    public static BitSet moveLeftBy(BitSet switches, int count) {
        BitSet cloneSet = (BitSet) switches.clone();
        cloneSet.clear(0, count);
        for(int i = count; i < 8; i++){
            boolean origValue = switches.get(i - count);
            cloneSet.set(i, origValue);
        }
        return cloneSet;
    }

    public static int leftShiftSteps(BitSet switches) {
        System.out.println(switches + " : " + switches.length());
        return 0;
    }

    public static int rightShiftSteps(BitSet switches) {
        return 0;
    }

    public static BitSet fromString(final String s) {
        return BitSet.valueOf(new long[]{Long.parseLong(s, 2)});
    }
}
