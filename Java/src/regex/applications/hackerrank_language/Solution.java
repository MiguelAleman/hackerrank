package regex.applications.hackerrank_language;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * Created by Miguel on 9/15/15.
 */
public class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            String regex = "^[0-9]+ (CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|" +
                    "LUA|BRAINFUCK|JAVASCRIPT|GO|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC|C|D)$";
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                if(Pattern.compile(regex).matcher(s).matches())
                    System.out.println("VALID");
                else
                    System.out.println("INVALID");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
