package algorithms.greedy.two_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            for (int j = 0; j < N; j++)
                A[j] = in.nextInt();
            for (int j = 0; j < N; j++)
                B[j] = in.nextInt();
            Arrays.sort(A);
            Arrays.sort(B);
            int index = N - 1;
            boolean ans = true;
            for (int j = 0; j < N; j++) {
                if (A[j] + B[index--] < K) {
                    ans = false;
                    break;
                }
            }
            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
