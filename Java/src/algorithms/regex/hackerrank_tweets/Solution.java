package algorithms.regex.hackerrank_tweets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            int tweets = 0;
            String pattern = "(?i)hackerrank";
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                if(Pattern.compile(pattern).matcher(s).find()) tweets++;
            }
            System.out.println(tweets);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
