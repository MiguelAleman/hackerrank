package super_monkey_challenge_II.cat;

import java.io.*;

public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                String s = br.readLine();
                int degree = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == 'C') {
                        for (int k = j + 1; k < s.length(); k++) {
                            if (s.charAt(k) == 'A') {
                                for (int l = k + 1; l < s.length(); l++) {
                                    if (s.charAt(l) == 'T') degree++;
                                }
                            }
                        }
                    }
                }
                System.out.println(degree);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}