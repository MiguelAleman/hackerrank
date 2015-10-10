package java_domain.data_structures.java_stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Miguel on 10/10/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String input = in.next();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') stack.push(ch);
                else {
                    if (stack.isEmpty()) {
                        stack.push(ch);
                        break;
                    }
                    char top = stack.pop();
                    if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                        stack.push(top);
                        break;
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
