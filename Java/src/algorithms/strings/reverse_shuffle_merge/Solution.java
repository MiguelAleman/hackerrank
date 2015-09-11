package algorithms.strings.reverse_shuffle_merge;

import java.util.Scanner;

/**
 * This solution doesn't work for all the cases
 * Created by Miguel on 9/5/15.
 */
public class Solution {

    private static int[] used;
    private static StringBuilder builder;
    private static int[] count;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();

        used = new int[26];
        count = new int[26];
        builder = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            count[getIndex(string.charAt(i))]++;
        }

        for (int i = string.length() - 1; i >= 0; i--) {
            int index = getIndex(string.charAt(i));
            if (used[index] < count[index] / 2)
                add(string, i, index);
        }
        System.out.println(builder.toString());
    }

    private static void add(String string, int i, int index) {
        int prev = 0;
        for (int j = i + 1; j < string.length(); j++) {
            if (string.charAt(j) == string.charAt(i))
                prev++;
        }
        if (prev - used[index] == count[index] / 2) {
            builder.append(string.charAt(i));
            used[index]++;
            return;
        }
        int equals = 0;
        for (int j = i - 1; j >= 0; j--) {
            if (string.charAt(j) < string.charAt(i) && used[getIndex(string.charAt(j))] < count[getIndex(string.charAt(j))]/2)
                return;
            if (string.charAt(j) == string.charAt(i))
                equals++;
            if (equals == count[index] / 2)
                break;
        }
        builder.append(string.charAt(i));
        used[index]++;
    }

    private static int getIndex(char c) {
        if (c == 'a')
            return 0;
        else if (c == 'b')
            return 1;
        else if (c == 'c')
            return 2;
        else if (c == 'd')
            return 3;
        else if (c == 'e')
            return 4;
        else if (c == 'f')
            return 5;
        else if (c == 'g')
            return 6;
        else if (c == 'h')
            return 7;
        else if (c == 'i')
            return 8;
        else if (c == 'j')
            return 9;
        else if (c == 'k')
            return 10;
        else if (c == 'l')
            return 11;
        else if (c == 'm')
            return 12;
        else if (c == 'n')
            return 13;
        else if (c == 'o')
            return 14;
        else if (c == 'p')
            return 15;
        else if (c == 'q')
            return 16;
        else if (c == 'r')
            return 17;
        else if (c == 's')
            return 18;
        else if (c == 't')
            return 19;
        else if (c == 'u')
            return 20;
        else if (c == 'v')
            return 21;
        else if (c == 'w')
            return 22;
        else if (c == 'x')
            return 23;
        else if (c == 'y')
            return 24;
        else if (c == 'z')
            return 25;
        return -1;
    }
}
