package java_domain.introduction.java_if_else;

import java.util.*;

/**
 * Created by Miguel on 5/26/16.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1) ans = "Weird";
        else{
            if(n>=2 && n <=5) ans = "Not Weird";
            else if(n>=6 && n<=20) ans = "Weird";
            else ans = "Not Weird";
        }
        System.out.println(ans);
    }
}

