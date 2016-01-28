package p2;

/*
 * Created by emailman on 1/28/2016.
 */

import java.util.Arrays;

public class Mine {
    public static void main(String[] sam) {
        int [] myHand = {21, 12, 50, 7, 0};
        System.out.println("Largest value in the hand = " + max(myHand));
        for (int each : myHand)
            System.out.println(each);
    }

    private static int max(int[] hand) {
        int guess = hand[0];
        for (int each : hand)
            if (each > guess)
                guess = each;
        Arrays.sort(hand);
        return guess;
    }
}
