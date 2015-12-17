package algorithms.regex.saying_hi;

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
            String regex = "^(?i)hi [^d]";
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                if(Pattern.compile(regex).matcher(s).find())
                    System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
