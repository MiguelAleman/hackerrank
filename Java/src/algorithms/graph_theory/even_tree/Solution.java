package algorithms.graph_theory.even_tree;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Miguel on 9/1/15.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] tree = new int[N];
        int[] count = new int[N];
        Arrays.fill(count, 1);
        for (int i = 0; i < M; i++) {
            int u1 = in.nextInt();
            int v1 = in.nextInt();
            tree[u1 - 1] = v1;
            count[v1 - 1] += count[u1 - 1];
            int root = tree[v1 - 1];
            while (root != 0) {
                count[root - 1] += count[u1 - 1];
                root = tree[root - 1];
            }
        }
        int counter = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}