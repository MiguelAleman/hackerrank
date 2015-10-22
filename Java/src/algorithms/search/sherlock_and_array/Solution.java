package algorithms.search.sherlock_and_array;

import java.util.Scanner;

/**
 * Created by Miguel on 10/20/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int A[] = new int[N];
            // left and right values
            int left = 0;
            int right = 0;
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
                right += A[j];
            }
            boolean found = false;
            for (int j = 0; j < N; j++) {
                right -= A[j];
                if (left == right) {
                    found = true;
                    break;
                } else left += A[j];
            }
            System.out.println(found ? "YES" : "NO");
        }
    }
}
