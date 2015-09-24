package java_domain.object_oriented_programming.java_inheritance_2;

/**
 * Created by Miguel on 9/23/15.
 */


class Arithmetic {
    int add(int x, int y) {
        return x + y;
    }
}


class Adder extends Arithmetic {

}


public class Solution {
    public static void main(String[] argh) {
        Adder X = new Adder();
        System.out.println("My superclass is: " + X.getClass().getSuperclass().getName());
        System.out.print(X.add(10, 32) + " " + X.add(10, 3) + " " + X.add(10, 10) + "\n");

    }
}