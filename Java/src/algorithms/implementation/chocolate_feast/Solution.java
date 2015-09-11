package algorithms.implementation.chocolate_feast;

import java.util.Scanner;

/**
 * Created by Miguel on 9/4/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int C = in.nextInt();
            int M = in.nextInt();
            int chocolates = (int) Math.floor(N / C);
            int wrappers = chocolates;
            while(wrappers >= M) {
                chocolates += (int) Math.floor(wrappers / M);
                wrappers = wrappers % M + (int) Math.floor(wrappers / M);
            }
            System.out.println(chocolates);
        }
    }
}
