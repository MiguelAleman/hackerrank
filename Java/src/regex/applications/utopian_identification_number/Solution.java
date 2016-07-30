package regex.applications.utopian_identification_number;

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
            String regex = "[a-z]{0,3}[0-9]{2,8}[A-Z]{3}[A-Z]*";
            for (int j = 0; j < N; j++) {
                if(Pattern.compile(regex).matcher(br.readLine()).matches())
                    System.out.println("VALID");
                else
                    System.out.println("INVALID");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
