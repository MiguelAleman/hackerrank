package java_domain.data_structures.java_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Miguel on 10/10/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, String> phone_book = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String number = in.nextLine();
            phone_book.put(name, number);
        }
        while (in.hasNextLine()) {
            String name = in.nextLine();
            String number = phone_book.get(name);
            if (number == null) System.out.println("Not found");
            else System.out.println(name + "=" + number);
        }
    }
}
