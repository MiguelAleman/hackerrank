package algorithms.search.count_luck;

import java.util.Scanner;

/**
 * Created by Miguel on 10/12/15.
 */
public class Solution {

    private static char[][] grid;
    private static boolean[][] visited;
    private static int N = -1, M = -1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            N = in.nextInt();
            M = in.nextInt();
            grid = new char[N][M];
            visited = new boolean[N][M];
            in.nextLine();
            int X = -1, Y = -1;
            for (int j = 0; j < N; j++) {
                String line = in.nextLine();
                for (int k = 0; k < M; k++) {
                    grid[j][k] = line.charAt(k);
                    if (grid[j][k] == 'X') visited[j][k] = true;
                    else if (grid[j][k] == 'M') {
                        X = j;
                        Y = k;
                    } else visited[j][k] = false;
                }
            }
            int K = in.nextInt();
            int W = wavesDFS(X, Y, 0);
            if (K == W) System.out.println("Impressed");
            else System.out.println("Oops!");

        }
    }

    private static int wavesDFS(int X, int Y, int W) {
        if (X < 0 || X >= N || Y < 0 || Y >= M || visited[X][Y]) return 0;
        else if (grid[X][Y] == '*') return W;

        int options = 0;
        if (X + 1 < N && (grid[X + 1][Y] == '.' || grid[X + 1][Y] == '*') && !visited[X + 1][Y]) options++;
        if (X - 1 >= 0 && (grid[X - 1][Y] == '.' || grid[X - 1][Y] == '*') && !visited[X - 1][Y]) options++;
        if (Y + 1 < M && (grid[X][Y + 1] == '.' || grid[X][Y + 1] == '*') && !visited[X][Y + 1]) options++;
        if (Y - 1 >= 0 && (grid[X][Y - 1] == '.' || grid[X][Y - 1] == '*') && !visited[X][Y - 1]) options++;
        if (options > 1) W++;

        visited[X][Y] = true;
        return wavesDFS(X + 1, Y, W) + wavesDFS(X - 1, Y, W) + wavesDFS(X, Y + 1, W) + wavesDFS(X, Y - 1, W);
    }
}
