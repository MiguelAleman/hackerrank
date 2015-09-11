package algorithms.strings.funny_string;

import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String S = in.next();
            String R = new StringBuffer(S).reverse().toString();
            for(int j = 1; j < S.length(); j++ ){
                if(Math.abs(S.charAt(j)-S.charAt(j-1))!=Math.abs(R.charAt(j)-R.charAt(j-1))){
                    System.out.println("Not Funny");
                    break;
                } else if(j == S.length() - 1)
                    System.out.println("Funny");
            }
        }
    }
}
