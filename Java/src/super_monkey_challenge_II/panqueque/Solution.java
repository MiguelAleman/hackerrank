package super_monkey_challenge_II.panqueque;

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
            int[] stacks = new int[N];

            // Get the higher value
            int higher = Integer.MIN_VALUE;

            for (int j = 0; j < N; j++) {
                stacks[j] = sc.nextInt();
                if (stacks[j] > higher) higher = stacks[j];
            }

            int sum = Integer.MIN_VALUE;
            int number = Integer.MIN_VALUE;

            for (int j = 2; j <= higher; j++) {
                int temp = 0;
                for (int k = 0; k < N; k++) {
                    if (stacks[k] % j == 0) temp += stacks[k];
                }
                if (temp > sum) {
                    number = j;
                    sum = temp;
                }
            }
            if (number == Integer.MIN_VALUE) System.out.println(2);
            else System.out.println(number);
        }
    }
}
