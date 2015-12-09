package super_monkey_challenge_II.gamer_arenas;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 10/15/15.
 */
public class Solution {
    private static boolean isAnagram(String A, String B) {
        char a[] = A.toLowerCase().toCharArray();
        char b[] = B.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return String.valueOf(a).equals(String.valueOf(b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {

            // Get Strings
            String P = sc.nextLine();
            String Q = sc.nextLine();

            // Remove Spaces
            String[] P_arr = P.split(" ");
            String[] Q_arr = Q.split(" ");

            StringBuilder P_builder = new StringBuilder();
            for (String s : P_arr) {
                P_builder.append(s);
            }

            StringBuilder Q_builder = new StringBuilder();
            for (String s : Q_arr) {
                Q_builder.append(s);
            }

            boolean ret = isAnagram(P_builder.toString(), Q_builder.toString());
            if (ret) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
