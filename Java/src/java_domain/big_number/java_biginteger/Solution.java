package java_domain.big_number.java_biginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
