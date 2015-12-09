package super_monkey_challenge_II.still_many_robots;


import java.util.Scanner;

/**
 * Created by Miguel on 10/22/15.
 */
public class Solution {

    private static long time = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++)
            System.out.println(robotsRec(in.nextLong(), 0) + " " + time);

    }

    private static long robotsRec(long K, long max_time) {
        if (K == 1) {
            time = max_time;
            return 1;
        }
        return 1 + K * (robotsRec(K - 1, max_time + K * K * K));
    }
}
