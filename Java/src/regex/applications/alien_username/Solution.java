package regex.applications.alien_username;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by Miguel on 10/12/15.
 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            String regex = "^[_||.][0-9]+[A-Za-z]*_?";
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                if (Pattern.compile(regex).matcher(s).matches()) System.out.println("VALID");
                else System.out.println("INVALID");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
