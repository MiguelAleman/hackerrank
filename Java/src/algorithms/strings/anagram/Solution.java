package algorithms.strings.anagram;

import java.util.Scanner;

/**
 * Created by Miguel on 9/3/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i =0 ; i < T; i++){
            String word = in.next();
            if(word.length()%2==1)
                System.out.println(-1);
            else{
                int[] count1 = countCharacters(word.substring(0,word.length()/2));
                int[] count2 = countCharacters(word.substring(word.length()/2, word.length()));
                int sum = 0;
                for(int j = 0; j < count1.length;j++){
                    sum+= Math.abs(count1[j] - count2[j]);
                }
                System.out.println(sum/2);
            }

        }
    }

    public static int[] countCharacters(String string) {
        int[] count = new int[26];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a')
                count[0]++;
            else if (string.charAt(i) == 'b')
                count[1]++;
            else if (string.charAt(i) == 'c')
                count[2]++;
            else if (string.charAt(i) == 'd')
                count[3]++;
            else if (string.charAt(i) == 'e')
                count[4]++;
            else if (string.charAt(i) == 'f')
                count[5]++;
            else if (string.charAt(i) == 'g')
                count[6]++;
            else if (string.charAt(i) == 'h')
                count[7]++;
            else if (string.charAt(i) == 'i')
                count[8]++;
            else if (string.charAt(i) == 'j')
                count[9]++;
            else if (string.charAt(i) == 'k')
                count[10]++;
            else if (string.charAt(i) == 'l')
                count[11]++;
            else if (string.charAt(i) == 'm')
                count[12]++;
            else if (string.charAt(i) == 'n')
                count[13]++;
            else if (string.charAt(i) == 'o')
                count[14]++;
            else if (string.charAt(i) == 'p')
                count[15]++;
            else if (string.charAt(i) == 'q')
                count[16]++;
            else if (string.charAt(i) == 'r')
                count[17]++;
            else if (string.charAt(i) == 's')
                count[18]++;
            else if (string.charAt(i) == 't')
                count[19]++;
            else if (string.charAt(i) == 'u')
                count[20]++;
            else if (string.charAt(i) == 'v')
                count[21]++;
            else if (string.charAt(i) == 'w')
                count[22]++;
            else if (string.charAt(i) == 'x')
                count[23]++;
            else if (string.charAt(i) == 'y')
                count[24]++;
            else if (string.charAt(i) == 'z')
                count[25]++;
        }
        return count;
    }
}
