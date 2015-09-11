package algorithms.warmup.plus_minus;

import java.util.Scanner;

/**
 * Created by Miguel on 8/30/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        double positives = 0, negatives = 0, zeros = 0;
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
            if (array[i] > 0) {
                positives++;
            } else if (array[i] == 0) {
                zeros++;
            } else {
                negatives++;
            }
        }
        System.out.print(String.format("%.3g%n", (positives / (double) array.length)));
        System.out.print(String.format("%.3g%n", (negatives / (double) array.length)));
        System.out.print(String.format("%.3g%n", (zeros / (double) array.length)));
    }
}
