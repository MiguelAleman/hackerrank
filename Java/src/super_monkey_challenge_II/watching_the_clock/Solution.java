package super_monkey_challenge_II.watching_the_clock;

/**
 * Created by Miguel on 10/8/15.
 */

import java.io.*;

public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                double M = Double.parseDouble(br.readLine());
                int j = 0;
                while (M >= 2) {
                    j++;
                    M /= 2;
                }
                System.out.println("Case #" + (i + 1) + ": " + j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}