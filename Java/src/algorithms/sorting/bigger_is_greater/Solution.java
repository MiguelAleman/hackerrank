package algorithms.sorting.bigger_is_greater;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Miguel on 9/3/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String S = in.next();
            boolean done = false;
            char[] array = new char[S.length()];
            for (int j = S.length() - 1; j >= 0; j--) {
                array[j] = S.charAt(j);
                char greater = getGreater(array,j);
                if(greater != S.charAt(j)){
                    char[] newC = new char[S.length()-j-1];
                    int count = 0;
                    for(int k = j; k < S.length();k++) {
                        if (k != getGreaterIndex(array,j))
                            newC[count++] = S.charAt(k);
                    }
                    Arrays.sort(newC);
                    System.out.println(S.substring(0,j)+greater+String.valueOf(newC));
                    done = true;
                    break;
                }
            }
            if(!done)
                System.out.println("no answer");

        }
    }

    private static char getGreater(char[] array,int j){
        char greater = array[j];
        for(int i = array.length-1; i >= 0;i--){
            if(array[i]>greater) {
                greater = array[i];
                break;
            }
        }
        return greater;
    }

    private static int getGreaterIndex(char[] array,int j){
        char greater = array[j];
        int index = -1;
        for(int i = array.length-1; i >= 0;i--){
            if(array[i]>greater) {
                greater = array[i];
                index = i;
                break;
            }
        }
        return index;
    }
}
