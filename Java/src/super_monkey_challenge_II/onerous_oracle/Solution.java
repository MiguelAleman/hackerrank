package super_monkey_challenge_II.onerous_oracle;

import java.util.*;

/**
 * Created by Miguel on 11/7/15.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            ArrayList<String> array = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            ArrayList<Integer> lengths = new ArrayList<>();

            int N = sc.nextInt();

            for (int c = 1; c <= N; c++) {
                for (int a = 1; a <= N; a++) {
                    for (int t = 1; t <= N; t++) {
                        if (c * a * t == N) {
                            array.add(getWord(c, a, t));
                            set.add(c + a + t);
                        }
                    }
                }
            }

            lengths.addAll(set);
            Collections.sort(array);
            Collections.sort(lengths);

            System.out.println(array.size());

            for (int j = 0; j < lengths.size(); j++) {
                for (int k = 0; k < array.size(); k++) {
                    if (array.get(k).length() == lengths.get(j))
                        System.out.println(array.get(k));
                }
            }
        }
    }

    public static String getWord(int C, int A, int T) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < C; i++) builder.append("C");
        for (int i = 0; i < A; i++) builder.append("A");
        for (int i = 0; i < T; i++) builder.append("T");
        return builder.toString();
    }
}
