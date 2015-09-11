package algorithms.strings.pangrams;

import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        S = S.toLowerCase();
        String[] A = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
                "p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < A.length; i++) {
            if(!S.contains(A[i])) {
                System.out.println("not pangram");
                break;
            }
            else if(i == A.length - 1)
                System.out.println("pangram");
        }
    }
}
