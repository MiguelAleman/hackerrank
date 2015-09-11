package algorithms.warmup.diagonal_difference;

import java.util.Scanner;

/**
 * Created by Miguel on 8/30/15.
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int[][] matrix = new int[N][N];
        int sumDiagonal1=0, sumDiagonal2=0;
        for (int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j]=in.nextInt();
                if(i==j){
                    sumDiagonal1+=matrix[i][j];
                }
                if(j==(N-1-i)){
                    sumDiagonal2+=matrix[i][j];
                }
            }
        }
        System.out.println(Math.abs(sumDiagonal1 - sumDiagonal2));
    }
}