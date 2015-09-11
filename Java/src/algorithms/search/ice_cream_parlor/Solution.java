package algorithms.search.ice_cream_parlor;

import java.util.Scanner;

/**
 * Created by Miguel on 9/6/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int M = in.nextInt();
            int N = in.nextInt();
            int[] F = new int[N];
            for (int j = 0; j < N; j++)
                F[j] = in.nextInt();
            boolean done = false;
            for (int j = 0; j < F.length; j++) {
                for (int k = j+1; k < F.length; k++) {
                    if (F[j] + F[k] == M) {
                        System.out.println((j+1) + " " + (k + 1));
                        done = true;
                        break;
                    }
                }
                if(done)
                    break;
            }
        }
    }
}
