package super_monkey_challenge_II.cheetah_chase;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Miguel on 11/19/15.
 */
public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int d = in.nextInt();
            int c = in.nextInt();
            int g = in.nextInt();
            if (g >= c) System.out.println("Case #" + (i + 1) + ": impossible");
            else {
                double result = Math.sqrt((2 * (double) d) / ((double) c - (double) g));
                DecimalFormat df = new DecimalFormat("0.00");
                System.out.println("Case #" + (i + 1) + ": " + df.format(result));
            }
        }
    }
}
