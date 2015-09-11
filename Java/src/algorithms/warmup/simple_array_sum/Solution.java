package algorithms.warmup.simple_array_sum;

import java.util.Scanner;

/**
 * Created by Miguel on 8/30/15.
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int Sum = 0;
        for (int i = 0; i < N; i++){
            Sum+=in.nextInt();
        }
        System.out.println(Sum);
    }
}
