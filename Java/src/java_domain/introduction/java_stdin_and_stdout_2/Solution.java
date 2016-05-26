package java_domain.introduction.java_stdin_and_stdout_2;

import java.util.Scanner;

/**
 * Created by Miguel on 5/26/16.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        //Complete this code

        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}