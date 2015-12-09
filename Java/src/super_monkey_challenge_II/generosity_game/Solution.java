package super_monkey_challenge_II.generosity_game;


import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Miguel on 11/19/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        HashMap<Integer, Long> acum = new HashMap<>();
        acum.put(1, in.nextLong());
        for (int i = 1; i < N; i++) {
            acum.put(i + 1, acum.get(i) + in.nextLong());
        }
        int Q = in.nextInt();
        for (int i = 0; i < Q; i++) {

            long R = in.nextLong();

            int index;
            if (N % 2 == 0) {
                index = N / 2;
            } else {
                index = (N / 2) + 1;
            }
            int winner = -1;
            boolean winnerFound = false;

            int bound1 = 1;
            int bound2 = N;

            while (true) {
                if (index == 1 && R < acum.get(index)) {
                    winner = index;
                    winnerFound = true;
                    break;
                } else if (index == N && R > acum.get(index)) {
                    System.out.println("none");
                    break;
                } else if (R == acum.get(index - 1)) {
                    winner = index - 1;
                    winnerFound = true;
                    break;
                } else if (R > acum.get(index - 1) && R <= acum.get(index)) {
                    winner = index;
                    winnerFound = true;
                    break;
                } else if (R > acum.get(index)) {
                    bound1 = index;
                    int temp = bound2 - index;
                    if (temp % 2 == 0) {
                        index += temp / 2;
                    } else {
                        index += (temp / 2 + 1);
                    }
                } else {
                    bound2 = index;
                    int temp = index - bound1;
                    if (temp % 2 == 0) {
                        index -= temp / 2;
                    } else {
                        index -= ((temp / 2) + 1);
                    }
                }
            }
            if (winnerFound) {
                System.out.println(winner);
            }
        }
    }
}
