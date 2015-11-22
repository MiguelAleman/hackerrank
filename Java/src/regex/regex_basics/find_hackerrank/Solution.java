package algorithms.regex.find_hackerrank;

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
            String start_regex = "^hackerrank", end_regex = "hackerrank$";
            for (int j = 0; j < N; j++) {
                boolean start = false, end = false;
                String s = br.readLine();
                if(Pattern.compile(start_regex).matcher(s).find())
                    start = true;
                if(Pattern.compile(end_regex).matcher(s).find())
                    end = true;
                if(start && end)
                    System.out.println("0");
                else if(start)
                    System.out.println("1");
                else if(end)
                    System.out.println("2");
                else
                    System.out.println("-1");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
