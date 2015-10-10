package java_domain.data_structures.java_1d_array_hard;

import java.util.Scanner;

/**
 * Created by Miguel on 9/18/15.
 */
public class Solution {

    private static int[] array;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int j = 0; j < T; j++) {
            int n = in.nextInt();
            int m = in.nextInt();
            array = new int[n];
            visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
                if (array[i] == 0) visited[i] = false;
                else visited[i] = true;
            }
            System.out.println(getAnswer(0, m) ? "YES" : "NO");
        }
    }

    public static boolean getAnswer(int index, int m) {
        if (index >= array.length) return true;
        else if (index < 0 || visited[index]) return false;
        visited[index] = true;
        return getAnswer(index - 1, m) || getAnswer(index + 1, m) || getAnswer(index + m, m);
    }
}

