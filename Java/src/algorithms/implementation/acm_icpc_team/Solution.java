package algorithms.implementation.acm_icpc_team;

import java.util.Scanner;

/**
 * Created by Miguel on 9/7/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int max = 0;
        int teams = 0;
        String[] binary = new String[N];
        for (int i = 0; i < N; i++) {
            binary[i] = in.next();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = 0;
                for (int k = 0; k < M; k++) {
                    if (binary[i].charAt(k) == '1' || binary[j].charAt(k) == '1')
                        temp++;
                }
                if (temp > max) {
                    max = temp;
                    teams = 1;
                } else if (temp == max)
                    teams++;
            }
        }
        System.out.println(max);
        System.out.println(teams);
    }
}
