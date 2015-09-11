package algorithms.bit_manipulation.maximizing_xor;

import java.util.Scanner;

/**
 * Created by Miguel on 9/4/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int R = in.nextInt();
        int max = -1;
        for (int i = L; i <= R; i++) {
            for (int j = i; j <= R; j++) {
                String L_b = Integer.toBinaryString(i);
                String R_b = Integer.toBinaryString(j);
                int xor = xor(L_b, R_b);
                if (max < xor) {
                    max = xor;
                }
            }
        }
        System.out.println(max);
    }

    private static int xor(String L_b, String R_b) {
        // Add bits if necessary
        String bits = "";
        for(int i = 0; i < Math.abs(L_b.length() - R_b.length()); i++)
            bits+="0";
        if(L_b.length()>R_b.length())
            R_b = bits + R_b;
        else if(L_b.length()<R_b.length())
            L_b = bits + L_b;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < L_b.length(); i++) {
            int A = Integer.parseInt(L_b.charAt(i) + "");
            int B = Integer.parseInt(R_b.charAt(i) + "");
            boolean xor = !(!(A == 1 && !(A == 1 && B == 1)) && !(B == 1 && !(A == 1 && B == 1)));
            if (xor)
                builder.append("1");
            else
                builder.append("0");
        }
        return Integer.parseInt(builder.toString(), 2);
    }
}
