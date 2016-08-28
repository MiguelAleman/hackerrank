package project_euler.pe_2;

import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 * Even Fibonacci Numbers
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long N = in.nextLong();
            long x;
            long y = 1;
            long z = 1;
            long sum = 0;
            while(z < N){
                x = y;
                y = z;
                z = x + y;
                if (z % 2 == 0 && z <= N)
                    sum += z;
            }
            System.out.println(sum);
        }
    }
}
