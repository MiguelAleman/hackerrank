package algorithms.greedy.priyanka_and_toys;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] W = new int[N];
        int units = 0;
        for (int i = 0; i < N; i++)
            W[i] = in.nextInt();
        Arrays.sort(W);
        int limit = -1;
        for (int i = 0; i < N; i++) {
            if (W[i] > limit) {
                units++;
                limit = W[i] + 4;
            }
        }
        System.out.println(units);
    }
}
