package algorithms.sorting.running_time_of_algorithms;

/**
 * Created by Miguel on 9/8/15.
 */

import java.util.Scanner;

public class Solution {

    public static int insertionSort(int[] ar) {
        int shifts = 0;
        for (int i = 1; i < ar.length; i++) {
            int temp = ar[i];
            int j;
            for (j = i - 1; j >= 0 && temp < ar[j]; j--) {
                ar[j + 1] = ar[j];
                shifts++;
            }
            ar[j + 1] = temp;
        }
        return shifts;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        System.out.println(insertionSort(ar));
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}

