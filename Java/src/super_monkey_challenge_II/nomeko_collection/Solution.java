package super_monkey_challenge_II.nomeko_collection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Miguel on 10/16/15.
 * Probability Theory Problem
 * Very Interesting!
 * General Information
 * Yi = # Nomekos till ith new Nomeko
 * Xi = Y(i+1) - Yi
 * YN = sum from 0 to N-1 of Xi
 * Xi = Geo(N-i)/N
 * Expected[Xi] = N/(N-i) = N * (1/(N-i))
 * Expected[YN] = Expected[sum from 0 to N-1 of Xi]
 * Using Linearity Expected[YN] = sum from 0 to N-1 of Expected[Xi]
 * Now, Expected[YN] = N * (sum from 0 to N-1 of (1/(N-i))
 * In Conclusion Expected[YN] = N * (sum from 1 to N of (1/i))
 * In our case since we already have 1 Nomeko captured
 * The answer will be Expected[YN] = N * (sum from 1 to N of (1/i)) - 1
 * Example: E[Y1] = 1 * (1/1) - 1 = 0.00 GOOD!
 * Example2: E[Y2] = 2 * (1/1 + 1/2) - 1 = 3 - 1 = 2.00 GOOD!
 * Example3: E[Y3] = 3 * (1/1 + 1/2 + 1/3) - 1 = 4.50 Lets find out!
 * It seems that the the Sum is too slow, I need to find a new method
 * Since sum from 1 to N of (1/i) = Harmonic Series
 * We can use Hn =~ ln(n) + lambda + 1/2n - 1/12n^2
 * It seems that the previous formula caused an error in the last test case
 * We need more terms
 * Hn =~ ln(n) + lambda + 1/2n - (sum from k=1 to infinity of (B2k/2kN^2k)
 * where Bk are the bernoulli numbers
 * Hn =` ln(n) + lambda + 1/2n - 1/12n^2 + 1/120n^4 - 1/252n^6 + 1/240n^8
 * Still getting an error :/
 * Lets use 20 terms of the bernoulli series
 * The first method used was to slow but is supposed to be more accurate
 * By comparing the results of the first method with the second and third
 * I found 15 out of 1000000 values that do not show the same output
 * Example
 * N = 601642
 * Method 1: 8353578.18
 * Method 2: 8353578.19
 * Method 3: 8353578.19
 * Solved this by executing method1 when the following regex
 * is satisfied: [0-9]+\\...5000.* meaning XXXX.XX5000XX
 */
public class Solution {

    // Euler-Mascheroni constant
    private static final double LAMBDA = 0.57721566490153286060651209008240;

    // Bernoulli Numbers (Sequence of rational numbers) for Method 3
    private static final double[] BERNOULLI = {1, 1.0 / 2.0, 1.0 / 6.0, 0.0, -1.0 / 30.0,
            0.0, 1.0 / 42.0, 0.0, -1.0 / 30.0,
            0.0, 5.0 / 66.0, 0.0, -691.0 / 2730.0,
            0.0, 7.0 / 6.0, 0.0, -3617.0 / 510.0,
            0.0, 43867.0 / 798.0, 0.0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double N = sc.nextDouble();
            System.out.println(method2(N));
        }
    }

    // Too slow
    private static String method1(double N) {
        double SUM = 0;
        for (double j = 1; j <= N; j++) SUM += 1.0 / j;
        double E = (N * SUM) - 1;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(E);
    }

    // Using Harmonic Series and Bernoulli with just a few terms
    private static String method2(double N) {
        double Hn = Math.log(N) + LAMBDA + (1.0 / (2.0 * N)) -
                (1.0 / (12.0 * N * N)) + (1.0 / (120.0 * N * N * N * N))
                - (1.0 / (252.0 * N * N * N * N * N * N)) + (1.0 / (240.0 * N * N * N * N * N * N * N * N));

        // Multiply by the number of Nomekos and subtract 1
        double E = (N * Hn) - 1.0;

        // The first term is not completely accurate
        if (E < 0) return "0.00";
        else {
            DecimalFormat df = new DecimalFormat("0.0000000");
            if (df.format(E).matches("[0-9]+\\...5000.*")) return method1(N);
            df = new DecimalFormat("0.00");
            return df.format(E);
        }
    }

    // Using Harmonic Series and Bernoulli with more terms
    private static String method3(double N) {

        // Calculate (sum from k=1 to 9 of (B2k/2kN^2k) first
        double bernoulli = 0;

        for (int k = 1; 2 * k < BERNOULLI.length; k++)
            bernoulli += (BERNOULLI[2 * k] / (2.0 * k * Math.pow(N, 2 * k)));

        // Harmonic Series
        double Hn = Math.log(N) + LAMBDA + (1.0 / (2.0 * N)) - bernoulli;

        // Multiply by the number of Nomekos and subtract 1
        double E = (N * Hn) - 1.0;

        // The first term is not completely accurate
        if (E < 0) return "0.00";
        else {
            DecimalFormat df = new DecimalFormat("0.0000000");
            if (df.format(E).matches("[0-9]+\\...5000.*")) return method1(N);
            df = new DecimalFormat("0.00");
            return df.format(E);
        }
    }
}