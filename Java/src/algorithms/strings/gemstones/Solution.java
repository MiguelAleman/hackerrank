package algorithms.strings.gemstones;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Miguel on 9/3/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> ar = new ArrayList<>();
        Set<Character> characters = new HashSet<>();
        for(int i = 0; i < N; i++)
            ar.add(in.next());
        for(int i = 0 ; i < ar.get(0).length(); i++)
            characters.add(ar.get(0).charAt(i));
        int sum = 0;
        for(Character e: characters) {
            boolean isInAll = true;
            for (String i : ar){
                if(!i.contains(e+"")) {
                    isInAll = false;
                    break;
                }
            }
            if(isInAll)
                sum++;
        }
        System.out.println(sum);
    }
}
