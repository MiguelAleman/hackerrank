package super_monkey_challenge_II.mobile_service;


import java.util.Scanner;

/**
 * Created by Miguel on 10/22/15.
 */
public class Solution {

    private static int[] P, Q, R, CC, C;
    private static int N, M;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            // Mobile phones
            M = in.nextInt();

            // Towers
            N = in.nextInt();

            // Position of phones relative to the beginning of the street
            P = new int[M];

            for (int j = 0; j < M; j++) {
                P[j] = in.nextInt();
            }

            // Position of towers relative to the beginning of the street
            Q = new int[N];

            // Broadcast radius
            R = new int[N];

            // Capacity of each tower
            C = new int[N];

            // Current Connections
            CC = new int[N];

            for (int j = 0; j < N; j++) {
                Q[j] = in.nextInt();
                R[j] = in.nextInt();
                C[j] = in.nextInt();
            }

            // Solution
            sortByAmountOfPossibleConnections();
            sortPhones();

            int answer = 0;

            for (int j = 0; j < M; j++) {

                boolean connected = false;

                if (P[j] == 0) continue;

                for (int k = 0; k < N; k++) {
                    if (CC[k] < C[k] && P[j] >= Q[k] - R[k] && P[j] <= Q[k] + R[k]) {
                        // Added
                        P[j] = 0;
                        answer++;
                        CC[k]++;
                        connected = true;
                        break;
                    }
                }

                if (connected) {
                    if (j > 4) j -= 3;
                    else if (j >= 1) j -= 1;
                    sortPhones();
                } else P[j] = 0;
            }
            System.out.println(answer);
        }
    }

    /**
     * Sort by amount of possible connections, < to >
     */
    private static void sortByAmountOfPossibleConnections() {
        int[] PC = new int[N];
        for (int j = 0; j < M; j++) {
            for (int k = 0; k < N; k++) {
                if (P[j] >= Q[k] - R[k] && P[j] <= Q[k] + R[k]) {
                    PC[k]++;
                }
            }
        }
        for (int k = 1; k < PC.length; k++) {
            int value = PC[k];
            int value_C = C[k];
            int value_Q = Q[k];
            int value_R = R[k];
            int j = k - 1;
            while (j >= 0 && PC[j] > value) {
                PC[j + 1] = PC[j];
                C[j + 1] = C[j];
                Q[j + 1] = Q[j];
                R[j + 1] = R[j];
                PC[j] = value;
                C[j] = value_C;
                Q[j] = value_Q;
                R[j] = value_R;
                j = j - 1;
            }
        }
    }

    /**
     * Sort phones depending on the amount of towers they can connect
     */
    private static void sortPhones() {
        int[] PC = new int[M];

        for (int j = 0; j < M; j++) {
            if (P[j] == 0) continue;
            else {
                for (int k = 0; k < N; k++) {
                    if (CC[k] < C[k] && P[j] >= Q[k] - R[k] && P[j] <= Q[k] + R[k]) {
                        PC[j]++;
                    }
                }
            }
        }

        for (int k = 1; k < PC.length; k++) {
            int value = PC[k];
            int value_P = P[k];
            int j = k - 1;
            while (j >= 0 && PC[j] > value) {
                PC[j + 1] = PC[j];
                P[j + 1] = P[j];
                PC[j] = value;
                P[j] = value_P;
                j = j - 1;
            }
        }
    }
}



