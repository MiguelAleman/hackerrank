package algorithms.implementation.utopian_tree;

import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int H = 1;
            for (int j = 0; j < N; j++) {
                if(j%2==0)
                    H=2*H;
                else
                    H+=1;
            }
            System.out.println(H);
        }
    }
}
