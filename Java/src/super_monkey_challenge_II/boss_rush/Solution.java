package super_monkey_challenge_II.boss_rush;

import java.util.Scanner;

/**
 * Created by Miguel on 10/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();

            int[] P = new int[N];
            int[] Q = new int[N];

            for (int j = 0; j < N; j++) {
                P[j] = sc.nextInt();
                Q[j] = sc.nextInt();
            }

            // Sort first array and keep order in the second
            for (int k = 1; k < P.length; k++) {
                int value = P[k];
                int value_Q = Q[k];
                int j = k - 1;
                while (j >= 0 && P[j] > value) {
                    P[j + 1] = P[j];
                    Q[j + 1] = Q[j];
                    P[j] = value;
                    Q[j] = value_Q;
                    j = j - 1;
                }
            }

            // Some important variables
            int stars = 0;
            int needed = 0;
            int defeated = 0;
            int bosses = 2 * N;
            boolean[] Q_ready = new boolean[N];
            boolean[] Q_defeated = new boolean[N];
            int P_pointer = 0;

            while (defeated < bosses) {

                while (P_pointer < N && stars >= P[P_pointer]) {
                    Q_ready[P_pointer] = true;
                    stars++;
                    defeated++;
                    P_pointer++;
                }

                boolean somethingAdded = false;

                for (int k = 0; k < Q.length; k++) {
                    if (Q_ready[k] && !Q_defeated[k] && stars >= Q[k]) {
                        stars += 2;
                        defeated++;
                        Q_defeated[k] = true;
                        somethingAdded = true;
                    }
                }

                if (!somethingAdded) {
                    // Find boss with less stars
                    int lessStars = Integer.MAX_VALUE;
                    for (int k = P_pointer; k < N; k++) {
                        if (P[k] < lessStars) {
                            lessStars = P[k];
                        }
                    }

                    for (int k = 0; k < Q.length; k++) {
                        if (Q_ready[k] && !Q_defeated[k] && Q[k] < lessStars) {
                            lessStars = Q[k];
                        }
                    }
                    int needed_now = lessStars - stars;
                    needed += needed_now;
                    stars += needed_now;
                }
            }
            System.out.println(needed);
        }
    }
}
