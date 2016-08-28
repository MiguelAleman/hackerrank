package project_euler.pe_1;

import java.util.Scanner;

/**
 * Created by Miguel on 9/6/15.
 * Multiples of 3 and 5
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            // 3
            long n1 = Math.floorDiv(N-1, 3);
            long s1 = ((3 + (n1 * 3)) * n1) / 2;
            // 5
            long n2 = Math.floorDiv(N-1, 5);
            long s2 = ((5 + (n2 * 5)) * n2) / 2;
            // 15
            long n3 = Math.floorDiv(N-1, 15);
            long s3 = ((15 + (n3 * 15)) * n3) / 2;
            System.out.println(s1 + s2 - s3);
        }
    }

    // Can't use this
    private static boolean module(int n, int m) {
        while (n > 0)
            n -= m;
        return n == 0;
    }
}
