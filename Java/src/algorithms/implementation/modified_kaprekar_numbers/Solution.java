package algorithms.implementation.modified_kaprekar_numbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Miguel on 9/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        boolean found = false;
        for (int i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if(!found)
            System.out.println("INVALID RANGE");
    }

    private static boolean isKaprekar(int n) {
        int d = (n + "").length();
        BigInteger n2 = new BigInteger(n+"").pow(2);
        int n2_l = (n2 + "").length();
        if ((n2 + "").length() == 1)
            return n2.intValue() == n;
        int r = Integer.parseInt((n2 + "").substring(n2_l - d, n2_l));
        int l = Integer.parseInt((n2 + "").substring(0, n2_l - d));
        return r + l == n;
    }
}
