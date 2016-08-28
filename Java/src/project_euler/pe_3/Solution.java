package project_euler.pe_3;

import java.util.Scanner;

/**
 * Created by Miguel on 8/28/16.
 */
public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            long N = in.nextLong();

            while(N%2 == 0) N /= 2;
            if(N == 1) {
                System.out.println(2);
                continue;
            }

            long j = 3;
            while(j*j <= N){
                if( N % j == 0){
                    N /= j;
                    j = 3;
                }
                else j += 2;
            }

            if(N > 2)
                System.out.println(N);
            else
                System.out.println(j);
        }
    }
}