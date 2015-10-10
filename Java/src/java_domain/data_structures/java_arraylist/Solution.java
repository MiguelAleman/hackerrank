package java_domain.data_structures.java_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Miguel on 10/10/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            int d = in.nextInt();
            for (int j = 0; j < d; j++) {
                numbers.add(in.nextInt());
            }
            lines.add(numbers);
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int line = in.nextInt() - 1;
            int position = in.nextInt() - 1;
            try {
                Integer number = lines.get(line).get(position);
                System.out.println(number);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
