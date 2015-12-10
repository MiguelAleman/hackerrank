package mathematics.fundamentals.halloween_party;

import java.util.Scanner;

/**
 * Created by Miguel on 12/10/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long K = in.nextLong();
            if (K % 2 == 0) System.out.println((K / 2) * (K / 2));
            else System.out.println((K / 2) * ((K + 1) / 2));
        }
    }
}
