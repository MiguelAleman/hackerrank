package super_monkey_challenge_II.imperfect_innovation;

import java.util.Scanner;

/**
 * Created by Miguel on 10/22/15.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {

            // R - Rows, C - Columns
            int R = in.nextInt();
            int C = in.nextInt();
            in.nextLine();

            // boolean grid, '.' = true, 'X' - false
            boolean[][] grid = new boolean[R][C];

            // Create boolean grid
            for (int j = 0; j < R; j++) {
                String line = in.nextLine();
                for (int k = 0; k < C; k++) {
                    grid[j][k] = line.charAt(k) == '.';
                }
            }

            int maxRectLength = 0;

            for (int j = 0; j < R; j++) {
                for (int k = 0; k < C; k++) {
                    if (grid[j][k]) {
                        int l = helper(grid, j, k, j + 1, k + 1, R, C, 1);
                        if (l > maxRectLength) maxRectLength = l;
                    }
                }
            }
            System.out.println(maxRectLength * maxRectLength);
        }
    }

    private static int helper(boolean[][] grid, int SR, int SC, int ER, int EC, int R, int C, int D) {
        if (ER >= R || EC >= C) return D;

        boolean isRectangle = true;

        for (int i = SC; i <= EC; i++) {
            if (!grid[ER][i]) {
                isRectangle = false;
                break;
            }
        }

        for (int i = SR; i <= ER; i++) {
            if (!grid[i][EC]) {
                isRectangle = false;
                break;
            }
        }

        if (isRectangle) return helper(grid, SR, SC, ER + 1, EC + 1, R, C, D + 1);
        else return D;
    }

}
