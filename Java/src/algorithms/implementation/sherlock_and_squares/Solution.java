package algorithms.implementation.sherlock_and_squares;

import java.util.Scanner;

/**
 * Created by Miguel on 9/1/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println((int)(Math.floor(Math.sqrt(B))-Math.ceil(Math.sqrt(A))+1));
        }
    }
}
