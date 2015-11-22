package algorithms.regex.split_the_phone_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            String regex = "([0-9]{1,3})[ -]([0-9]{1,3})[ -]([0-9]{4,10})";
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                Pattern patter = Pattern.compile(regex);
                Matcher matcher = patter.matcher(s);
                if (matcher.matches()) {
                    String country = matcher.group(1);
                    String local = matcher.group(2);
                    String number = matcher.group(3);
                    System.out.println("CountryCode=" + country
                            + ",LocalAreaCode=" + local + ",Number=" + number);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
