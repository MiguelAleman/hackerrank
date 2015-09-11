package algorithms.sorting.intro_to_tutorial_challenges;

import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            if(in.nextInt() == V)
                System.out.println(i);
        }
    }
}
