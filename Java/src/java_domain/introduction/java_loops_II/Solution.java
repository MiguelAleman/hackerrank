package java_domain.introduction.java_loops;

import java.util.Scanner;

/**
 * Created by Miguel on 9/14/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int cum = a;
            for (int j = 0; j < n; j++) {
                cum+=Math.pow(2,j)*b;
                System.out.print(cum+" ");
            }
            System.out.println();
        }
    }
}
