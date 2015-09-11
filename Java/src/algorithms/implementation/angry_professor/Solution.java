package algorithms.implementation.angry_professor;

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
            int K = in.nextInt();
            int Sum = 0;
            for(int j = 0; j < N; j++){
                if(in.nextInt() <= 0)
                    Sum++;
            }
            if(Sum>=K)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}