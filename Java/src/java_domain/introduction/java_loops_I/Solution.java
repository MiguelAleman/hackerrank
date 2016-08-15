package java_domain.introduction.java_loops_I;

import java.util.Scanner;

/**
 * Created by Miguel on 8/14/16.
 */
public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++)
            System.out.println(N + " x " + i + " = " + N * i);
    }
}
