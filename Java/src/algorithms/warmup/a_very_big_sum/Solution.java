package algorithms.warmup.a_very_big_sum;

import java.util.Scanner;

/**
 * Created by Miguel on 8/30/15.
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        long Sum = 0;
        for (int i = 0; i < N; i++){
            Sum+=in.nextLong();
        }
        System.out.println(Sum);
    }
}