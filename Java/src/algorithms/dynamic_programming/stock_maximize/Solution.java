package algorithms.dynamic_programming.stock_maximize;

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
            System.out.println(stockRecursive(A, 0));
        }
    }

    private static long stockRecursive(int[] A, int index) {
        if (index >= A.length)
            return 0;
        else {
            int greater = -1, greater_i = -1;
            for (int i = index; i < A.length; i++) {
                if (A[i] > greater) {
                    greater = A[i];
                    greater_i = i;
                }
            }
            long stocks = 0, spent = 0;
            for (int i = index; i < greater_i; i++) {
                stocks++;
                spent += A[i];
            }
            return stocks * greater - spent + stockRecursive(A, ++greater_i);
        }
    }
}
