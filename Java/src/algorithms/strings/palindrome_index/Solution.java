package algorithms.strings.palindrome_index;

import java.util.Scanner;

/**
 * Created by Miguel on 9/5/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String string = in.next();
            int rev = string.length() - 1;
            int index = -1;
            for (int j = 0; j < (int) Math.floor(string.length() / 2); j++) {
                if (string.charAt(j) != string.charAt(rev)) {
                    if (isPalindrome(string.substring(j, rev)))
                        index = rev;
                    else if (isPalindrome(string.substring(j + 1, rev + 1)))
                        index = j;
                    break;
                }
                rev--;
            }
            System.out.println(index);
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

