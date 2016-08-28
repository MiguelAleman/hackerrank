package project_euler.pe_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Miguel on 8/28/16.
 * This solution is too slow
 */
public class Solution_b {

    public static ArrayList<Long> primeNumbers = new ArrayList<>();

    // Will use this number to start adding prime numbers to the array
    public static long largestN = 2;

    public static void main(String[] args){

        // Add the prime number "2" to the array
        primeNumbers.add(new Long(2));

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            long N = in.nextInt();
            updatePrimeNumbers(N);
            for(int j = primeNumbers.size() - 1; j >= 0 ; j--){
                if(N % primeNumbers.get(j) == 0){
                    System.out.println(primeNumbers.get(j));
                    break;
                }
            }
        }
    }

    public static void updatePrimeNumbers(long N){
        if(N > largestN){
            for(long i = largestN; i <= N; i++){
                if(isPrime(i)){
                    primeNumbers.add(i);
                    System.out.println(i);
                }
            }
            largestN = N;
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
