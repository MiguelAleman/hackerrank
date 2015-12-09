package super_monkey_challenge_II.take_this;

import java.util.Scanner;

/**
 * Created by Miguel on 11/16/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int case_ = 1;
        while (in.hasNext()) {
            long N = in.nextLong();
            long P = in.nextLong();

            if (N == 0) break;
            if (P == 2) {
                System.out.println("Case #" + case_++ + ": yes");
                continue;
            }

            // Max power
            int M = (int) Math.floor(Math.log(N) / Math.log(P));

            if (Math.pow(P, M + 1) == N) {
                System.out.println("Case #" + case_++ + ": yes");
                continue;
            }

            // Powers of P
            long[] PW = new long[M + 1];

            // Generate
            PW[0] = 1;
            for (int i = 1; i <= M; i++) {
                PW[i] = PW[i - 1] * P;
            }

            long sum = 0;
            boolean found = false;
            for (int j = M; j >= 0; j--) {
                if (sum + PW[j] < N) sum += PW[j];
                else if (sum + PW[j] == N) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "Case #" + case_ + ": yes" : "Case #" + case_ + ": no");
            case_++;
        }
    }
}