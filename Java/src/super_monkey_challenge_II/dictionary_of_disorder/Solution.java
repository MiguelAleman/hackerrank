package super_monkey_challenge_II.dictionary_of_disorder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Miguel on 11/19/15.
 */
public class Solution {

    private static int[] PRIME_NUMBERS = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,
            107, 109, 113};

    private static long getRepresentation(char[] word) {
        long result = 1L;
        for (char c : word) {
            int num = c - 65;
            result *= PRIME_NUMBERS[num];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        ArrayList<char[]> words = new ArrayList<>();
        int[] anagrams = new int[N];

        anagrams[0] = 0;
        words.add(in.nextLine().toUpperCase().toCharArray());
        System.out.println(anagrams[0]);

        for (int i = 1; i < N; i++) {
            words.add(in.nextLine().toUpperCase().toCharArray());
            for (int j = i - 1; j >= 0; j--) {
                if (words.get(i).length != words.get(j).length) {
                    continue;
                }
                if (getRepresentation(words.get(i)) == getRepresentation(words.get(j))) {
                    anagrams[i] = anagrams[j] + 1;
                    break;
                }
            }
            System.out.println(anagrams[i]);
        }
    }
}
