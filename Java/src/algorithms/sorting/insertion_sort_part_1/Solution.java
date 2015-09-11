package algorithms.sorting.insertion_sort_part_1;

import java.util.Scanner;

/**
 * Created by Miguel on 9/1/15.
 */

public class Solution {

    public static void insertIntoSorted(int[] ar) {
        int value = ar[ar.length - 1];
        for (int i = ar.length - 2; i >= 0; i--) {
            ar[i + 1] = ar[i];
            printArray(ar);
            if (i-1 < 0 || value >= ar[i - 1]) {
                ar[i] = value;
                printArray(ar);
                break;
            }
        }
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}


