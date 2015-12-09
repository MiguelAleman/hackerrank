package super_monkey_challenge_II.take_this;

import java.util.Scanner;

/**
 * Created by Miguel on 11/16/15.
 */
public class Solution_b {
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

            // Powers of P
            long[] PW = new long[M + 1];

            // Generate
            PW[0] = 1;
            for (int i = 1; i <= M; i++) {
                PW[i] = PW[i - 1] * P;
            }

            // Vector of M+1 bits (weights)
            int V = (int) Math.pow(2, M + 1) - 1;

            boolean found = false;

            for (int i = 0; i <= V; i++) {
                long sum = 0;
                String vector = Integer.toBinaryString(i);
                int index = 0;
                for (int j = vector.length() - 1; j >= 0; j--) {
                    if (vector.charAt(j) == '1') {
                        sum += PW[index];
                    }
                    index++;
                }

                if (sum == N) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "Case #" + case_ + ": yes" : "Case #" + case_ + ": no");
            case_++;
        }
    }
}
