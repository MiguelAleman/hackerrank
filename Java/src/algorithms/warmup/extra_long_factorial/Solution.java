package algorithms.warmup.extra_long_factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {

    static BigInteger factorial(int number){
        if(number == 0 || number == 1)
            return new BigInteger("1");
        else
            return factorial(number-1).multiply(new BigInteger(number+""));
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        BigInteger result = factorial(number);
        System.out.println(result);
    }
}