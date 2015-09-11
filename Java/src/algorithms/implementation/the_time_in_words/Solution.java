package algorithms.implementation.the_time_in_words;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Miguel on 9/9/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        generateMap(map);
        int H = in.nextInt();
        int M = in.nextInt();

        // Special Cases
        if (M == 0)
            System.out.println(map.get(H) + " o' clock");
        else if (M == 1)
            System.out.println(map.get(M) + " minute past " + map.get(H));
        else if (M == 15 || M == 30)
            System.out.println(map.get(M) + " past " + map.get(H));
        else if (M == 45)
            System.out.println(map.get(15) + " to " + map.get((H + 1) % 12));
        else if (M == 59)
            System.out.println(map.get(60 - M) + " minute to " + map.get((H + 1) % 12));

        // Ranges
        else if (M >= 2 && M <= 20)
            System.out.println(map.get(M) + " minutes past " + map.get(H));
        else if (M >= 21 && M <= 29)
            System.out.println(map.get(20) + " " + map.get(M - 20) + " minutes past " + map.get(H));
        else if (M >= 31 && M <= 39)
            System.out.println(map.get(20) + " " + map.get(40 - M) + " minutes to " + map.get((H + 1) % 12));
        else if (M >= 40 && M <= 58)
            System.out.println(map.get(60 - M) + " minutes to " + map.get((H + 1) % 12));
    }

    public static void generateMap(Map<Integer, String> map) {
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "quarter");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "half");
    }
}
