package super_monkey_challenge_II.nomeko_collection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Miguel on 10/21/15.
 */
public class Solution_b {

    private static HashMap<Integer, String> NOBMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        populateMap();
        for (int i = 0; i < T; i++) System.out.println(NOBMap.get(sc.nextInt()));
    }

    private static void populateMap() {
        double SUM = 0;
        for (int j = 1; j <= 1000000; j++) {
            SUM += 1.0 / j;
            double E = (j * SUM) - 1;
            DecimalFormat df = new DecimalFormat("0.00");
            NOBMap.put(j, df.format(E));
        }
    }
}
