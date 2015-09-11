package algorithms.implementation.find_digits;

import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int R = 0;
            String N_s = N+"";
            for(int j = 0; j < N_s.length(); j++){
                char C = N_s.charAt(j);
                if(C != '0' && N%Integer.parseInt(C+"")==0)
                    R++;
            }
            System.out.println(R);
        }
    }
}
