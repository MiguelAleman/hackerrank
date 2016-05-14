package mathematics.fundamentals.find_point;

import java.util.Scanner;

/**
 * Created by Miguel on 12/19/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int P1 = in.nextInt();
            int P2 = in.nextInt();
            int Q1 = in.nextInt();
            int Q2 = in.nextInt();
            int D1 = Q1 - P1;
            int D2 = Q2 - P2;
            System.out.println((Q1 + D1) + " " + (Q2 + D2));
        }
    }
}
