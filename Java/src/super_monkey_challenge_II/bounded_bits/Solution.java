package super_monkey_challenge_II.bounded_bits;

import java.util.Scanner;

/**
 * Created by Miguel on 10/31/15.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int i = 0; i < T; i++) {
            String line = in.nextLine();
            if (line.length() <= 8) {
                int value = Integer.parseInt(line);
                System.out.println((int) (Math.floor(Math.log(value) / Math.log(2)) + 1));
            } else {
                int zeros = line.length() - 8;
                int value = Integer.parseInt(line.substring(0, 8));
                System.out.println((int) (Math.floor(Math.log(value) / Math.log(2) + zeros * Math.log(10) / Math.log(2)) + 1));
            }
        }
    }
}
