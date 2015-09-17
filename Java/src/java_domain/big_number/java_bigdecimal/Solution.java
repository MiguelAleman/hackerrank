package java_domain.big_number.java_bigdecimal;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++)
            s[i] = in.next();
        for (int i = 1; i < s.length; i++) {
            String temp = s[i];
            BigDecimal bd = new BigDecimal(s[i]);
            int j;
            for (j = i - 1; j >= 0 && bd.compareTo(new BigDecimal(s[j])) == 1; j--)
                s[j + 1] = s[j];
            s[j + 1] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.println(s[i]);
    }
}
