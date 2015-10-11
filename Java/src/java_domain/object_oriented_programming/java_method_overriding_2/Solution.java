package java_domain.object_oriented_programming.java_method_overriding_2;

/**
 * Created by Miguel on 10/10/15.
 */

class BiCycle {
    String define_me() {
        return "a vehicel with pedals.";
    }
}

class MotorCycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is " + temp);
    }

}

class Solution {
    public static void main(String[] argh) {
        MotorCycle M = new MotorCycle();
    }
}
