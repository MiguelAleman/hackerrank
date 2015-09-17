package java_domain.strings.java_anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 9/15/15.
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
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A, B);
        if (ret) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
