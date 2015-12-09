package super_monkey_challenge_II.cat_II;

import java.io.*;
import java.util.ArrayList;


public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                String s = br.readLine();
                int degree = 0;
                ArrayList<Integer> array = new ArrayList<>();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == 'C') {
                        array.add(1);
                    } else if (s.charAt(j) == 'A') {
                        for (int k = 0; k < array.size(); k++)
                            array.set(k, array.get(k) + 1);
                    } else if (s.charAt(j) == 'T') {
                        for (int k = 0; k < array.size(); k++)
                            degree += array.get(k) - 1;
                    }
                }
                System.out.println(degree);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}