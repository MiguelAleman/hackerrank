package super_monkey_challenge_II.the_princess_is_in_another_castle;

import java.util.Scanner;

/**
 * Created by Miguel on 11/11/15.
 * This approach takes too long
 */
public class Solution_b {

    private static boolean visited[];
    private static int N;
    private static int[] F;
    private static int[] P;
    private static int[] Q;
    private static int max;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            // Number of Castles in the world
            N = in.nextInt();

            // Frequency of nodes
            F = new int[N];

            // Two-way roads from castle P to castle Q (edges of a graph)
            P = new int[N - 1];
            Q = new int[N - 1];

            // An array that will contain all the vertices of all the edges
            for (int j = 0; j < N - 1; j++) {
                P[j] = in.nextInt() - 1;
                Q[j] = in.nextInt() - 1;
                F[P[j]]++;
                F[Q[j]]++;
            }

            // Find nodes that are connected only to one other node

            // If there is only two numbers with frequency == 1, then the answer is N
            int ones = 0;
            for (int j = 0; j < N; j++)
                if (F[j] == 1)
                    ones++;

            if (ones == 2)
                System.out.println(N);
            else {
                max = -1;
                for (int j = 0; j < N; j++) {
                    if (F[j] == 1) {
                        visited = new boolean[N];
                        dfs(j, 1);
                    }
                }

                if (max == -1) max = 1;
                System.out.println(max + "");
            }
        }
    }

    private static void dfs(int node, int w) {
        visited[node] = true;
        if (w > max) max = w;
        for (int i = 0; i < N - 1; i++) {
            if (P[i] == node && !visited[Q[i]])
                dfs(Q[i], w + 1);
            if (Q[i] == node && !visited[P[i]])
                dfs(P[i], w + 1);
        }
    }
}
