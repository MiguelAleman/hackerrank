package super_monkey_challenge_II.precipitous_promotion;

import java.util.Scanner;

/**
 * Created by Miguel on 11/9/15.
 */
public class Solution {

    private static boolean[] visited;
    private static int[] data;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            int N = in.nextInt();

            visited = new boolean[N];
            data = new int[N];

            for (int j = 0; j < N; j++) data[j] = in.nextInt() - 1;

            int result = 0;
            for (int j = 0; j < N; j++) {
                if (visited[j] == false) {
                    createGraph(j);
                    result++;
                }
            }
            System.out.println(result);
        }
    }

    private static void createGraph(int position) {
        visited[position] = true;
        for (int i = 0; i < data.length; i++) {
            if ((i == data[position] || data[i] == position) && visited[i] == false)
                createGraph(i);
        }
    }
}
