package algorithms.dynamic_programming.the_maximum_subarray;

import java.util.Scanner;

/**
 * Created by Miguel on 9/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < N; j++)
                A[j] = in.nextInt();
            int max = Integer.MIN_VALUE, sum = 0, nonn = 0;
            for (int j = 0; j < A.length; j++) {
                sum += A[j];
                if (sum > max)
                    max = sum;
                if (sum < 0)
                    sum = 0;
                if (A[j] > 0)
                    nonn += A[j];
            }
            if (nonn == 0)
                System.out.println(max + " " + max);
            else
                System.out.println(max + " " + nonn);
        }
    }
}
