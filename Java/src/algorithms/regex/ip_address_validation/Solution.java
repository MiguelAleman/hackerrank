package algorithms.regex.ip_address_validation;

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

            String regex_IPv4 = "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\." +
                    "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\." +
                    "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\." +
                    "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";

            String regex_IPv6 = "^[0-9a-f]{1,4}:[0-9a-f]{1,4}:" +
                    "[0-9a-f]{1,4}:[0-9a-f]{1,4}:[0-9a-f]{1,4}:" +
                    "[0-9a-f]{1,4}:[0-9a-f]+:[0-9a-f]{1,4}$";

            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                if (Pattern.compile(regex_IPv4).matcher(s).find()) System.out.println("IPv4");
                else if (Pattern.compile(regex_IPv6).matcher(s).find()) System.out.println("IPv6");
                else System.out.println("Neither");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
