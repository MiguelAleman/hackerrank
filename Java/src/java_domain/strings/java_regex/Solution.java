package java_domain.strings.java_regex;

import java.util.Scanner;

/**
 * Created by Miguel on 9/14/15.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }

    private static class myRegex {
        String pattern = "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\." +
                "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])" +
                "\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
    }
}
