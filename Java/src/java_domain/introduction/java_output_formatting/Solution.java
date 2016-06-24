package java_domain.introduction.java_output_formatting;

import java.util.Scanner;

/**
 * Created by Miguel on 9/14/15.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++) {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            for(int j = 0; j < 15-s1.length(); j++)
                System.out.print(" ");
            for(int j = 0; j < 3 - (x+"").length(); j++)
                System.out.print("0");
            System.out.println(x);
        }
        System.out.println("================================");

    }
}