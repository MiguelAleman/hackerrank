package algorithms.dynamic_programming.the_coin_change_problem;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Miguel on 10/13/15.
 */
public class Solution {

    private static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] C = new int[M];
        for (int i = 0; i < M; i++) C[i] = in.nextInt();
        //System.out.println(changeRecursive(new int[N], 0, N, C));
        System.out.println(changeIterative(N, M, C));
    }

    // Too Slow
    private static int changeRecursive(int[] sequence, int value, int max, int[] coins) {
        String key = "";
        for (int i = 0; i < sequence.length; i++) key += sequence[i] + " ";
        if (map.containsKey(key)) return 0;
        map.put(key, key);
        if (value == max) return 1;
        if (value > max) return 0;
        int result = 0;
        for (int i = 0; i < coins.length; i++) {
            int[] temp = sequence.clone();
            temp[0] = coins[i];
            Arrays.sort(temp);
            result += changeRecursive(temp, value + coins[i], max, coins);
        }
        return result;
    }
    
    // Dynamic Programming
    private static long changeIterative(int N, int M, int[] C) {
        long T[][] = new long[N + 1][M];
        for (int j = 0; j < M; j++) {
            T[0][j] = 1;
        }
        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < M; j++) {
                long x, y;
                if (i - C[j] >= 0) x = T[i - C[j]][j];
                else x = 0;
                if (j >= 1) y = T[i][j - 1];
                else y = 0;
                T[i][j] = x + y;
            }
        }
        return T[N][M - 1];
    }
}