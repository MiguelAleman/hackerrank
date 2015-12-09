package super_monkey_challenge_II.the_princess_is_in_another_castle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Miguel on 11/11/15.
 */
public class Solution {

    private static boolean visited[];
    private static HashMap<Integer, ArrayList<Integer>> map;
    private static int max_value;
    private static int max_node;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            // Number of Castles in the world
            int N = in.nextInt();

            map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                map.put(j, new ArrayList<>());
            }

            int P, Q;
            for (int j = 0; j < N - 1; j++) {
                P = in.nextInt() - 1;
                Q = in.nextInt() - 1;
                map.get(P).add(Q);
                map.get(Q).add(P);
            }

            max_value = 0;
            visited = new boolean[N];
            dfs(0, 1);

            max_value = 0;
            visited = new boolean[N];
            dfs(max_node, 1);

            System.out.println(max_value);
        }

    }

    private static void dfs(int node, int w) {
        visited[node] = true;
        if (w > max_value) {
            max_value = w;
            max_node = node;
        }

        ArrayList<Integer> adj = map.get(node);
        for (int i = 0; i < adj.size(); i++) {
            int num = adj.get(i);
            if (!visited[num]) {
                dfs(num, w + 1);
            }
        }
    }
}
