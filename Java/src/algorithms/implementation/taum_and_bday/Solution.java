package algorithms.implementation.taum_and_bday;

import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long B = in.nextLong();
            long W = in.nextLong();
            long X = in.nextLong();
            long Y = in.nextLong();
            long Z = in.nextLong();
            long black, white;
            if (B * X < B * (Y + Z))
                black = B * X;
            else
                black = B * (Y + Z);
            if (W * Y < W * (X + Z))
                white = W * Y;
            else
                white = W * (X + Z);
            System.out.println(black + white);
        }
    }
}
