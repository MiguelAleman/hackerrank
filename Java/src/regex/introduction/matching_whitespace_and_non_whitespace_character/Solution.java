package regex.introduction.matching_whitespace_and_non_whitespace_character;

import java.util.*;
import java.util.regex.*;

/**
 * Created by Miguel on 12/9/15.
 */
public class Solution {
    public static void main(String[] args) {
        Regex_Test tester = new Regex_Test();
        tester.checker("\\S{2}\\s\\S{2}\\s\\S{2}");
    }
}

class Regex_Test {
    public void checker(String Regex_Pattern){
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }
}