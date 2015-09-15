package java_domain.strings.java_string_token;

import java.util.Scanner;

/**
 * Created by Miguel on 9/14/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.length() > 400000) ;
            // Do nothing
        else if (s.length() == 0)
            System.out.println("0");
        else {
            int j = 0;
            if ((s.charAt(0) + "").matches("[\\s!,?._'@]+"))
                j = 1;
            String[] split = s.split("[\\s!,?._'@]+");
            if (split.length == 0)
                System.out.println("0");
            else {
                System.out.println(split.length - j);
                for (int i = j; i < split.length; i++)
                    System.out.println(split[i]);
            }
        }
    }
}
