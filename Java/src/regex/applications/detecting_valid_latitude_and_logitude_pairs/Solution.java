package regex.applications.detecting_valid_latitude_and_logitude_pairs;

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
            String regex = "^\\([+-]?(90(\\.0+)?|([0-8]?[0-9](\\.[0-9]+)?)), [+-]?(180(\\.0+)?|1[0-7][0-9](\\.[0-9]+)?|[0-9]?[0-9](\\.[0-9]+)?)\\)$";
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                if (Pattern.compile(regex).matcher(s).matches()) System.out.println("Valid");
                else System.out.println("Invalid");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
