package project_euler.pe_4;

import java.util.Scanner;

/**
 * Created by Miguel on 9/8/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int largest = 1;
            int product1 = 999;
            while (product1 > 100) {
                int product2 = product1;
                while (product2 > 100) {
                    int number = product1 * product2;
                    if (isPalindrome(number + "")) {
                        if (number > largest && number < N)
                            largest = number;
                    }
                    product2--;
                }
                product1--;
            }
            System.out.println(largest);
        }
    }

    public static boolean isPalindrome(String s) {
        boolean result = true;
        int rev = s.length() - 1;
        for (int i = 0; i < (int) Math.floor(s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(rev--)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
