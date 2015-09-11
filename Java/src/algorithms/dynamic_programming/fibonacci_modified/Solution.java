package algorithms.dynamic_programming.fibonacci_modified;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Miguel on 9/1/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(fibonacci_modified(in.nextInt(), in.nextInt(), in.nextInt()));
    }

    public static BigInteger fibonacci_modified(int a, int b, int N) {
        if (N == 3)
            return new BigInteger((b * b + a)+"");
        else if(N == 4)
            return new BigInteger(((b * b + a)*(b * b + a)  + b)+"");
        else {
            BigInteger temp = fibonacci_modified(a, b, N - 1);
            return temp.multiply(temp).add(fibonacci_modified(a, b, N - 2));
        }
    }
}
