package algorithms.strings.sherlock_and_anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
* Created by Miguel on 9/4/15.
        */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String word = in.next();
            int sum=0;
            for (int j = 1; j < word.length(); j++) {
                for (int k = 0; k+j-1 < word.length(); k++) {
                    String sub = word.substring(k,k+j);
                    for (int m = k+1; m+j-1 < word.length(); m++) {
                        String sub2 = word.substring(m,m+j);
                        char[] temp = sub.toCharArray();
                        char[] temp2 = sub2.toCharArray();
                        Arrays.sort(temp);
                        Arrays.sort(temp2);
                        if(String.valueOf(temp).equals(String.valueOf(temp2)))
                            sum++;

                    }
                }
            }
            System.out.println(sum);
        }
    }
}
