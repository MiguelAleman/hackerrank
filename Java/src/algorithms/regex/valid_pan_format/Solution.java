package algorithms.regex.valid_pan_format;

import java.io.*;


public class Solution {
    private static boolean isValidPAN(String s) {
        if(s.matches("^[A-Z]{5}[0-9]{4}[A-Z]$"))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

