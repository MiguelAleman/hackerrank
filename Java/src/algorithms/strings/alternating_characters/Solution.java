package algorithms.strings.alternating_characters;

import java.util.Scanner;

/**
 * Created by Miguel on 9/1/15.
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String S = in.next();
            int D = 0;
            char P = S.charAt(0);
            for(int j = 1; j < S.length(); j++){
                if(S.charAt(j) == P)
                    D++;
                else
                    P = S.charAt(j);
            }
            System.out.println(D);
        }
    }
}
