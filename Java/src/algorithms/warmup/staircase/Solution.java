package algorithms.warmup.staircase;

import java.util.Scanner;
/**
 * Created by Miguel on 8/30/15.
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = N-1;
        for (int i = 0; i < N; i++){
            for(int j = 0; j < (N-1-i); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < N - count; j++){
                System.out.print("#");
            }
            count--;
            System.out.println();
        }
    }
}