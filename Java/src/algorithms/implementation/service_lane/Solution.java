package algorithms.implementation.service_lane;

import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int T = in.nextInt();
        int[] W = new int[N];
        for(int i = 0; i < N; i++){
            W[i] = in.nextInt();
        }
        for (int m = 0; m < T; m++) {
            int i = in.nextInt();
            int j = in.nextInt();
            int smallest = 99;
            for(int n = i; n <= j; n++){
                if(W[n] < smallest)
                    smallest = W[n];
            }
            System.out.println(smallest);
        }
    }
}
