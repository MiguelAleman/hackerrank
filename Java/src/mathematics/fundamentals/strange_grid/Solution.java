package mathematics.fundamentals.strange_grid;

import java.util.Scanner;

/**
 * Created by Miguel on 5/15/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long r = in.nextLong();
        long c = in.nextLong();
        if (r % 2 == 0) System.out.println(((r/2)-1)*10 + 1 + (c-1)*2);
        else System.out.println((r/2)*10 + (c-1)*2);
    }
}