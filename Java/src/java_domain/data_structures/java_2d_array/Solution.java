package java_domain.data_structures.java_2d_array;

import java.util.Scanner;

/**
 * Created by Miguel on 10/9/15.
 */
public class Solution {

    private static final int ROWS = 6;
    private static final int COLUMNS = 6;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) for (int j = 0; j < COLUMNS; j++) grid[i][j] = in.nextInt();
        int largestSum = Integer.MIN_VALUE;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                int temp = getHourGlass(grid, i, j);
                if (temp > largestSum) largestSum = temp;
            }
        }
        System.out.println(largestSum);
    }

    private static int getHourGlass(int[][] grid, int i, int j) {
        if (j - 1 < 0 || j + 1 >= COLUMNS || i + 2 >= ROWS) return Integer.MIN_VALUE;
        return grid[i][j] + grid[i][j - 1] + grid[i][j + 1] + grid[i + 1][j] + grid[i + 2][j]
                + grid[i + 2][j - 1] + grid[i + 2][j + 1];
    }
}
