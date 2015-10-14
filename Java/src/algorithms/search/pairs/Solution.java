package algorithms.search.pairs;

import java.util.*;


/**
 * Created by Miguel on 10/12/15.
 */

public class Solution {

    // Using Sorting anf Two Pointer Technique (Too Slow)
    static int pairs(int[] a, int k) {

        int res = 0;

        // Sorting
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j];
                a[j] = value;
                j = j - 1;
            }
        }


        // Two Pointer Technique
        int i = 0, j;
        while (a[a.length - 1] - a[i] >= k) {
            j = a.length - 1;
            while (a[j] - a[i] > k && j > 0) j--;
            if (a[j] - a[i] == k) res++;
            i++;
        }
        return res;
    }

    // Using List (Too Slow)
    static int pairs_(int[] a, int k) {
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) list.add(a[i]);
        for (int i = 0; i < a.length; i++) if (a[i] >= k && list.contains(a[i] - k)) res++;
        return res;
    }

    // Using Hashmap (Accepted)
    static int pairs__(int[] a, int k) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) map.put(a[i], a[i]);
        for (int i = 0; i < a.length; i++) if (a[i] >= k && map.containsKey(a[i] - k)) res++;
        return res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String n = in.nextLine();
        String[] n_split = n.split(" ");

        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);

        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");

        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }

        res = pairs__(_a, _k);
        System.out.println(res);
    }
}
