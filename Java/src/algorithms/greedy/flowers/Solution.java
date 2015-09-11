package algorithms.greedy.flowers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 9/4/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] prices = new int[N];
        int[] customers = new int[K];
        int money = 0;
        for(int i = 0; i < N; i++)
            prices[i] = in.nextInt();
        Arrays.sort(prices);
        for(int i = N-1; i >= 0; i--) {
            money+=prices[i]*(customers[i%K]+1);
            customers[i % K]++;
        }
        System.out.println(money);
    }
}
