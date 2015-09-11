package algorithms.implementation.cut_the_sticks;

import java.util.Scanner;

/**
 * Created by Miguel on 9/1/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++)
            array[i] = (in.nextInt());
        int i = 0, sum = 0;
        int smallest = smallestStick(array);
        while (true) {
            if (array[i % N] > 0) {
                array[i % N] -= smallest;
                sum++;
            }
            if (i % N == N - 1) {
                if (sum == 0)
                    break;
                smallest = smallestStick(array);
                System.out.println(sum);
                sum = 0;
            }
            i++;
        }
    }

    public static int smallestStick(int[] array) {
        int smallest = 9999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >0 && array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
}
