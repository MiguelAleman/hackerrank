package java_domain.exception_handling.java_exception_handling_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Miguel on 10/11/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int div = x / y;
            System.out.println(div);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
