package java_domain.strings.java_string_compare;

import java.util.*;

/**
 * Created by Miguel on 9/14/15.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String[] sub = new String[s.length() - k + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            sub[i] = s.substring(i, i + k);
        }
        Arrays.sort(sub);
        System.out.println(sub[0]);
        System.out.println(sub[sub.length - 1]);
    }
}