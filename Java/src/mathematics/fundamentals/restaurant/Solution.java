package mathematics.fundamentals.restaurant;

import java.util.*;

/**
 * Created by Miguel on 12/10/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int l = in.nextInt();
            int b = in.nextInt();
            int m = Math.min(l, b);
            for (int j = m; j > 0; j--) {
                if ((l % j == 0) && (b % j == 0)) {
                    System.out.println(((l * b) / (j * j)));
                    break;
                }
            }
        }
    }
}