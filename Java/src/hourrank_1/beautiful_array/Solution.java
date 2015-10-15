package hourrank_1.beautiful_array;

import java.util.Scanner;

/**
 * Created by Miguel on 10/15/15.
 */
public class Solution {

    private static int[] array;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) array[i] = in.nextInt();
        int value = getValue(l);
        if (value == 0) {
            System.out.println(value);
        } else {
            int compare;
            int ks = 0;
            while (true) {
                int largestIndex = getLargestIndex();
                int smallestIndex = getSmallestIndex();
                if (array[largestIndex] - array[smallestIndex] <= 1) break;
                array[largestIndex]--;
                array[smallestIndex]++;
                ks++;
                compare = getValue(l) + (k * ks);
                if (compare < value) {
                    value = compare;
                }
            }
            System.out.println(value);
        }
    }

    // Using only the second option (l)
    private static int getValue(int l) {
        int result = 0;
        int largest = array[getLargestIndex()];
        for (int i = 0; i < array.length; i++) result += largest - array[i];
        return result * l;
    }

    private static int getLargestIndex() {
        int index = -1;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int getSmallestIndex() {
        int index = -1;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
}
