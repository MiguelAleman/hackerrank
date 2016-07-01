package java_domain.strings.pattern_syntax_checker;

import java.util.Scanner;
import java.util.regex.*;

/**
 * Created by Miguel on 6/30/16.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        while (N > 0) {
            String pattern = in.nextLine();
            boolean valid = true;
            try{
                Pattern.compile(pattern);
            } catch(PatternSyntaxException e){
                valid = false;
            }
            System.out.println(valid ? "Valid" : "Invalid");
        }
    }
}