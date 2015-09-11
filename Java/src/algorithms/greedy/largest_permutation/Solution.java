package algorithms.greedy.largest_permutation;

import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long K = in.nextLong();
        long swaps = 0;
        int added = 0;
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = in.nextInt();
        while (swaps < K) {
            int greater = -1;
            int index = 0;
            for (int i = A.length - 1; i >= added; i--) {
                if (A[i] > greater) {
                    greater = A[i];
                    index = i;
                }
            }
            if (index == A.length - 1 && added == index) {
                break;
            } else if (index == added)
                added++;
            else {
                A[index] = A[added];
                A[added++] = greater;
                swaps++;
            }
        }
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }
}
