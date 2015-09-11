package algorithms.strings.two_strings;

import java.util.Scanner;

/**
 * Created by Miguel on 9/4/15.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            String A = in.next();
            String B = in.next();
            int count[] = new int[26];
            for(int j = 0; j < A.length(); j++){
                if(A.charAt(j) == 'a')
                    count[0]++;
                else if(A.charAt(j) == 'b')
                    count[1]++;
                else if(A.charAt(j) == 'c')
                    count[2]++;
                else if(A.charAt(j) == 'd')
                    count[3]++;
                else if(A.charAt(j) == 'e')
                    count[4]++;
                else if(A.charAt(j) == 'f')
                    count[5]++;
                else if(A.charAt(j) == 'g')
                    count[6]++;
                else if(A.charAt(j) == 'h')
                    count[7]++;
                else if(A.charAt(j) == 'i')
                    count[8]++;
                else if(A.charAt(j) == 'j')
                    count[9]++;
                else if(A.charAt(j) == 'k')
                    count[10]++;
                else if(A.charAt(j) == 'l')
                    count[11]++;
                else if(A.charAt(j) == 'm')
                    count[12]++;
                else if(A.charAt(j) == 'n')
                    count[13]++;
                else if(A.charAt(j) == 'o')
                    count[14]++;
                else if(A.charAt(j) == 'p')
                    count[15]++;
                else if(A.charAt(j) == 'q')
                    count[16]++;
                else if(A.charAt(j) == 'r')
                    count[17]++;
                else if(A.charAt(j) == 's')
                    count[18]++;
                else if(A.charAt(j) == 't')
                    count[19]++;
                else if(A.charAt(j) == 'u')
                    count[20]++;
                else if(A.charAt(j) == 'v')
                    count[21]++;
                else if(A.charAt(j) == 'w')
                    count[22]++;
                else if(A.charAt(j) == 'x')
                    count[23]++;
                else if(A.charAt(j) == 'y')
                    count[24]++;
                else if(A.charAt(j) == 'z')
                    count[25]++;
            }

            boolean done = false;
            for(int j = 0; j < B.length(); j++){
                if(B.charAt(j) == 'a'){
                    if(count[0]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'b'){
                    if(count[1]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'c'){
                    if(count[2]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'd'){
                    if(count[3]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'e'){
                    if(count[4]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'f'){
                    if(count[5]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'g'){
                    if(count[6]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'h'){
                    if(count[7]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'i'){
                    if(count[8]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'j'){
                    if(count[9]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'k'){
                    if(count[10]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'l'){
                    if(count[11]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'm'){
                    if(count[12]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'n'){
                    if(count[13]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'o'){
                    if(count[14]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'p'){
                    if(count[15]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'q'){
                    if(count[16]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'r'){
                    if(count[17]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 's'){
                    if(count[18]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 't'){
                    if(count[19]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'u'){
                    if(count[20]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'v'){
                    if(count[21]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'w'){
                    if(count[22]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'x'){
                    if(count[23]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'y'){
                    if(count[24]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
                else if(B.charAt(j) == 'z'){
                    if(count[25]>0) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
            }
            if(!done)
                System.out.println("NO");
        }
    }
}
