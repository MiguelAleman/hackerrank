package algorithms.implementation.library_fine;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Miguel on 8/31/15.
 */
public class Solution {
    static PrintStream out = System.out;
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int[] actual = new int[3];
        int[] expected = new int[3];
        for (int i = 0; i < 6; i++){
            if(i<3)
                actual[i]=in.nextInt();
            else
                expected[i-3]=in.nextInt();
        }
        if(actual[2]<expected[2] || actual[2]==expected[2] && actual[1]<expected[1]
                || actual[2]==expected[2] && actual[1]==expected[1] && actual[0]<=expected[0])
            out.println(0);
        else if(actual[2]==expected[2] && actual[1]==expected[1])
            out.println(15*(actual[0]-expected[0]));
        else if(actual[2]==expected[2])
            out.println(500*(actual[1]-expected[1]));
        else if(actual[2]!=expected[2])
            out.println(10000);
    }
}