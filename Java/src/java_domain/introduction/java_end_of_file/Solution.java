package java_domain.introduction.java_end_of_file;

import java.util.*;

/**
 * Created by Miguel on 9/14/15.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        while (in.hasNextLine())
            System.out.println(i++ + " " + in.nextLine());
    }
}
