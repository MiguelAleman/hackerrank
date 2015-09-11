package algorithms.sorting.insertion_sort_part_2;

import java.util.*;

public class Solution {

    public static void insertionSortPart2(ArrayList<Integer> ar) {
        for (int i = 1; i < ar.size(); i++) {
            for(int j = 0; j < ar.size(); j++){
                if(ar.get(i) <= ar.get(j)){
                    int temp = ar.get(i);
                    ar.remove(i);
                    ar.add(j, temp);
                    break;
                }
            }
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < s; i++) {
            ar.add(in.nextInt());
        }
        insertionSortPart2(ar);
    }

    private static void printArray(ArrayList<Integer> ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}

