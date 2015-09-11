package algorithms.strings.make_it_anagram;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String S2 = in.next();
        ArrayList<String> temp = new ArrayList<>();
        int sum=0;
        for(int i = 0 ; i < S.length(); i++)
            temp.add(S.charAt(i)+"");
        for(int i = 0 ; i < S2.length(); i++){
            if(temp.contains(S2.charAt(i)+""))
                temp.remove(S2.charAt(i)+"");
            else
                sum++;
        }
        System.out.println(temp.size()+sum);
    }
}
