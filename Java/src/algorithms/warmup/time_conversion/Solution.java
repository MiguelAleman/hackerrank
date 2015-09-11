package algorithms.warmup.time_conversion;

import java.util.Scanner;

/**
 * Created by Miguel on 8/30/15.
 */
public class Solution {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String time = in.next();
        if(time.equals("00:00:00")){
            System.out.println(time);
        }
        else if(time.matches(".*AM.*")){
            if(time.substring(0,2).equals("12"))
                System.out.println("00"+time.substring(2,time.length()-2));
            else
                System.out.println(time.substring(0,time.length()-2));
        }
        else{
            if(time.substring(0,2).equals("12"))
                System.out.println("12"+time.substring(2,time.length()-2));
            else
                System.out.println((Integer.parseInt((time.split(":")[0]))+12)+time.substring(2,time.length()-2));
        }
    }
}