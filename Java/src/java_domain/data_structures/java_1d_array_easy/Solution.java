package java_domain.data_structures.java_1d_array_easy;

import java.util.Scanner;

/**
 * Created by Miguel on 9/18/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = array[i];
            if (sum < 0)
                count++;
            for (int j = i + 1; j < n; j++) {
                sum += array[j];
                if (sum < 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
