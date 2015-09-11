package algorithms.implementation.encryption;

import java.util.Scanner;

/**
 * Created by Miguel on 9/5/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String[] no_spaces = string.split(" ");
        string = "";
        for(int i =0; i < no_spaces.length;i++)
            string+=no_spaces[i];
        int R = (int) Math.floor(Math.sqrt(string.length()));
        int C = (int) Math.ceil(Math.sqrt(string.length()));
        if(R*C < string.length())
            R++;
        char[][] grid = new char[R][C];
        int count = 0;
        for(int i = 0 ; i < R; i++){
            for(int j = 0; j < C; j++){
                if(count < string.length()) {
                    grid[i][j] = string.charAt(count++);
                }
            }
        }
        for(int i = 0 ; i < C; i++){
            for(int j = 0; j < R; j++){
                if(grid[j][i] != '\u0000')
                    System.out.print(grid[j][i]);
            }
            System.out.print(" ");
        }
    }
}
