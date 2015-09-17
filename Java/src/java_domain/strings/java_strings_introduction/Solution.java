package java_domain.strings.java_strings_introduction;

import java.util.Scanner;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(a.length() + b.length());
        if (a.compareTo(b) > 0) System.out.println("Yes");
        else System.out.println("No");
        System.out.println((a.charAt(0) + "").toUpperCase() + a.substring(1, a.length()) + " "
                + (b.charAt(0) + "").toUpperCase() + b.substring(1, b.length()));
    }
}
