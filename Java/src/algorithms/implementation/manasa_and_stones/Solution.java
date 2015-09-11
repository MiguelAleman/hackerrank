package algorithms.implementation.manasa_and_stones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Miguel on 9/6/15.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(0);
            int n = in.nextInt();
            n--;
            int one = in.nextInt();
            int two = in.nextInt();
            int a = Math.min(one, two);
            int b = Math.max(one, two);
            int current = a * n;
            int max = b * n;
            int difference = b - a;
            if (a == b) {
                System.out.println(current);
            } else {
                StringBuilder builder = new StringBuilder();
                while (current <= max) {
                    builder.append(current + " ");
                    current += difference;
                }
                System.out.println(builder.toString());
            }
        }
    }
}
