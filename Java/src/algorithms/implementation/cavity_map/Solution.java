package algorithms.implementation.cavity_map;

import java.util.Scanner;

/**
 * Created by Miguel on 9/4/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int grid[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            String line = in.next();
            for (int j = 0; j < line.length(); j++) {
                grid[i][j] = Integer.parseInt(line.charAt(j) + "");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = grid[i][j];
                boolean cavity = false;
                if ((i - 1) >= 0 && grid[i - 1][j] < value) {
                    if ((i + 1) < n && grid[i + 1][j] < value) {
                        if ((j - 1) >= 0 && grid[i][j - 1] < value) {
                            if ((j + 1) < n && grid[i][j + 1] < value)
                                cavity = true;
                        }
                    }
                }
                if (cavity)
                    System.out.print("X");
                else
                    System.out.print(value);
            }
            System.out.println("");
        }
    }
}
