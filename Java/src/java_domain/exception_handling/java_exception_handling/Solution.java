package java_domain.exception_handling.java_exception_handling;


import java.util.Scanner;

/**
 * Created by Miguel on 10/11/15.
 */

class myCalculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) throw (new Exception("n and p should be non-negative"));
        else return (int) Math.pow(n, p);
    }
}

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try {
                System.out.println(M.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}