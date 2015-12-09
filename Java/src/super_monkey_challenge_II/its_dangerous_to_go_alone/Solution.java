package super_monkey_challenge_II.its_dangerous_to_go_alone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 11/11/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            // Number of Travelers
            int N = in.nextInt();

            // Maximum bridge weight
            int C = in.nextInt();

            // Link's weight
            int L = in.nextInt();

            // Max weight without Link
            int M = C - L;

            // Travelers' weight
            int[] W = new int[N];

            for (int j = 0; j < N; j++) W[j] = in.nextInt();

            Arrays.sort(W);

            int pointerL = 0;
            int pointerR = N - 1;

            if (W[pointerR] > M)
                System.out.println("Case #" + (i + 1) + ": impossible");
            else {
                int trips = 0;
                while (true) {
                    if (pointerL == pointerR) {
                        trips++;
                        break;
                    }
                    if (W[pointerL] + W[pointerR] <= M) {
                        if (pointerR - pointerL == 1) {
                            trips++;
                            break;
                        } else trips += 2;
                        pointerL++;
                        pointerR--;
                    } else {
                        trips += 2;
                        pointerR--;
                    }
                }
                System.out.println("Case #" + (i + 1) + ": " + trips);
            }
        }
    }
}
