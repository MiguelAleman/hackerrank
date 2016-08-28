package project_euler.pe_5;

import java.util.Scanner;

/**
 * Created by Miguel on 8/28/16.
 * Smallest Multiple
 */
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int N = in.nextInt();
            long result = 1;
            for(int j = N; j >= 2; j--){
                if(isPrime(j)){
                    // Find power of the prime number
                    int power = 1;
                    while(Math.pow(j, power) <= N) power++;
                    result *= Math.pow(j, power -1);
                }
            }
            System.out.println(result);
        }
    }

    public static boolean isPrime(long number){
        // We can stop checking when i reaches sqrt(number)
        for(long i = 2; i*i <= number; i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}
