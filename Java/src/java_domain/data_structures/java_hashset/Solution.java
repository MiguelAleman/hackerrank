package java_domain.data_structures.java_hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/**
 * Created by Miguel on 10/10/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < T; i++) {
            String element = in.next() + "_" + in.next();
            set.add(element);
            System.out.println(set.size());
        }
    }
}
