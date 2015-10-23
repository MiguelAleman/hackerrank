package mathematics.fundamentals.handshakes;

import java.util.Scanner;

/**
 * Created by Miguel on 10/23/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            long N = in.nextLong();
            long sum = 0;
            while (--N >= 1) sum += N;
            System.out.println(sum);
        }
    }
}
