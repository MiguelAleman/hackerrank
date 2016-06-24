package java_domain.introduction.java_static_initializer_block;

import java.util.Scanner;

/**
 * Created by Miguel on 6/24/16.
 */
public class Solution {

    static Scanner in = new Scanner(System.in);;
    static int B = in.nextInt();
    static int H = in.nextInt();
    static boolean flag = true;

    // Executed when class is loaded (once)
    static {
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
