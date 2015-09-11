package algorithms.greedy.jim_and_the_orders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] array = new long[n];
        long[] sorted = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = in.nextLong() + in.nextLong();
        System.arraycopy(array, 0, sorted, 0, array.length);
        Arrays.sort(sorted);
        ArrayList<Integer> added = new ArrayList<>();
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (sorted[i] == array[j] && !added.contains(j)) {
                    added.add(j);
                    System.out.print(j + 1 + " ");
                }
            }
        }
    }
}
