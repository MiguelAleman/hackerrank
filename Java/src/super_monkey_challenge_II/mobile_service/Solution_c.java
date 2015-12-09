package super_monkey_challenge_II.mobile_service;

import java.util.Scanner;

/**
 * Created by Miguel on 10/22/15.
 */
public class Solution_c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            // Mobile phones
            int M = in.nextInt();

            // Towers
            int N = in.nextInt();

            // Position of phones relative to the beginning of the street
            int P[] = new int[M];

            for (int j = 0; j < M; j++) {
                P[j] = in.nextInt();
            }

            // Position of towers relative to the beginning of the street
            int Q[] = new int[N];

            // Broadcast radius
            int R[] = new int[N];

            // Capacity of each tower
            int C[] = new int[N];

            for (int j = 0; j < N; j++) {
                Q[j] = in.nextInt();
                R[j] = in.nextInt();
                C[j] = in.nextInt();
            }


            // Solution

            // Current Connections
            int CC[] = new int[N];

            for (int j = 0; j < N; j++) {
                System.out.print(" R: " + R[j]);
                System.out.print(" Q: " + Q[j]);
                System.out.println(" C: " + C[j]);
            }

            // Sort by Radius
            for (int k = 1; k < C.length; k++) {
                int value = C[k];
                int value_Q = Q[k];
                int value_R = R[k];
                int j = k - 1;
                while (j >= 0 && R[j] > value_R) {
                    C[j + 1] = C[j];
                    Q[j + 1] = Q[j];
                    R[j + 1] = R[j];
                    C[j] = value;
                    Q[j] = value_Q;
                    R[j] = value_R;
                    j = j - 1;
                }
            }

            for (int j = 0; j < N; j++) {
                System.out.print(" R: " + R[j]);
                System.out.print(" Q: " + Q[j]);
                System.out.println(" C: " + C[j]);
            }

            int answer = 0;

            for (int j = 0; j < M; j++) {
                // P[j] = phone position
                for (int k = N - 1; k >= 0; k--) {
                    if (P[j] >= Q[k] - R[k] && P[j] <= Q[k] + R[k] && CC[k] < C[k]) {
                        answer++;
                        CC[k]++;
                        break;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}