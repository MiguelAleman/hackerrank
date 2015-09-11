package algorithms.implementation.sherlock_and_the_beast;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {

    public static PrintStream out = System.out;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int R5 = getResidual(N);
            int R3 = N - R5;
            if (R5 < 0)
                out.println("-1");
            else {
                R5 /= 3;
                R3 /= 5;
                while (R5-- > 0)
                    out.print("555");
                while (R3-- > 0)
                    out.print("33333");
                out.println();
            }
        }
    }

    public static int getResidual(int n) {
        while (n > 0) {
            if (n % 3 == 0)
                break;
            else
                n -= 5;
        }
        return n;
    }
}
