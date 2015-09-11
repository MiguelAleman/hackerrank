package algorithms.implementation.caesar_cipher;

import java.util.Scanner;

/**
 * Created by Miguel on 9/4/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();
        int K = in.nextInt();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (Character.isLetter(S.charAt(i))) {
                builder.append(getChar(S.charAt(i),K));
            } else
                builder.append(S.charAt(i));
        }
        System.out.println(builder.toString());
    }

    private static char getChar(char c, int k) {
        boolean lower = Character.isLowerCase(c);
        int index = -1;
        c = Character.toLowerCase(c);
        char[] lower_ar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i < lower_ar.length;i++){
            if(c == lower_ar[i]){
                index = i;
                break;
            }
        }
        if(lower)
            return (lower_ar[(index+k)%26]);
        else
            return Character.toUpperCase(lower_ar[(index+k)%26]);
    }

}
