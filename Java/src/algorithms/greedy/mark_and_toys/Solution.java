package algorithms.greedy.mark_and_toys;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] prices = new int[N];
        int items = 0;
        for (int i = 0; i < N; i++)
            prices[i] = in.nextInt();
        Arrays.sort(prices);
        while (K > 0)
            K -= prices[items++];
        if (K < 0)
            System.out.println(items - 1);
        else
            System.out.println(items);
    }
}
