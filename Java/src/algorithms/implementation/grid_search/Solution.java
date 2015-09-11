package algorithms.implementation.grid_search;

import java.util.Scanner;


/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){

            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int j = 0; j < R; j++){
                G[j] = in.next();
            }

            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int j = 0; j < r; j++){
                P[j] = in.next();
            }

            int P_index=0;
            int S_index=-1;
            boolean IN = false;
            for(int j = 0; j < R; j++){
                if(G[j].contains(P[P_index])) {
                    if(S_index==-1){
                        S_index = G[j].indexOf(P[P_index]);
                        P_index++;
                    }else
                        if(S_index == G[j].indexOf(P[P_index]))
                            P_index++;
                        else {
                            P_index = 0;
                            S_index = -1;
                        }
                }
                if(P_index == r) {
                    IN = true;
                    break;
                }
            }
            if(IN)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
