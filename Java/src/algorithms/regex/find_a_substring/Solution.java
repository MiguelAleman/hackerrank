package algorithms.regex.find_a_substring;

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
                String regex = "[\\w\\d_]"+word+"[\\w\\d_]";
                int count = 0;
                Pattern pattern = Pattern.compile(regex);
                for(int i = 0; i < lines.length;i++){
                    Matcher matcher = pattern.matcher(lines[i]);
                    while(matcher.find()) count++;
                }
                System.out.println(count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
