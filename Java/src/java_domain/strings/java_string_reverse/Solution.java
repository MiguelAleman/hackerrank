package java_domain.strings.java_string_reverse;

import java.util.Scanner;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    private static boolean isPalindrome(String A) {
        boolean result = true;
        int rev = A.length()-1;
        for (int i = 0; i < A.length()/2; i++){
            if(A.charAt(i) != A.charAt(rev--)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        boolean ret = isPalindrome(A);
        if (ret) System.out.println("Yes");
        else System.out.println("No");
    }
}
