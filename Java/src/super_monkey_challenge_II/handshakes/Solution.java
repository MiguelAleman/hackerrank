package super_monkey_challenge_II.handshakes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Miguel on 10/8/15.
 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            long T = Long.parseLong(br.readLine());
            while (T != 0) {
                int product = 1, teams = 2;
                while (product <= T) {
                    int number = 9 * product;
                    if (number == T) {
                        System.out.println(teams);
                        break;
                    } else if (number > T) {
                        System.out.println("impossible");
                        break;
                    }
                    product = product + teams++;
                }
                T = Long.parseLong(br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
