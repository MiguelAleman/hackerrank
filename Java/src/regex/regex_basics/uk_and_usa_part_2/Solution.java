package algorithms.regex.uk_and_usa_part_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            String[] lines = new String[N];
            for (int j = 0; j < N; j++)
                lines[j] = br.readLine();
            int T = Integer.parseInt(br.readLine());
            for (int j = 0; j < T; j++) {
                String word = br.readLine();
                Matcher m = Pattern.compile("our").matcher(word);
                int start = 0, count = 0;
                if (m.find()) start = m.start();
                String regex = "(\\s|^)?"+word.substring(0, start) + "(our|or)"
                        + word.substring(start + 3, word.length()) + "($|\\s)";
                for (int i = 0; i < lines.length; i++) {
                    m = Pattern.compile(regex).matcher(lines[i]);
                    while (m.find()) count++;
                }
                System.out.println(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
