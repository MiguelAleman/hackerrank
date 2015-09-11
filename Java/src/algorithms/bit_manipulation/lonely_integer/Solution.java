package algorithms.bit_manipulation.lonely_integer;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int number = in.nextInt();
            if(array.contains(number))
                array.remove(new Integer(number));
            else
                array.add(number);
        }
        System.out.println(array.get(0));
    }
}
