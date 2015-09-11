package algorithms.strings.the_love_letter_mystery;

import java.util.Scanner;

/**
 * Created by Miguel on 9/5/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i  = 0 ; i < T ; i++){
            String string = in.next();
            int rev = string.length()-1;
            int sum = 0;
            for(int j = 0; j < string.length()/2;j++){
                sum+=Math.abs(((int) string.charAt(j))-((int) string.charAt(rev--)));
            }
            System.out.println(sum);
        }
    }
}
