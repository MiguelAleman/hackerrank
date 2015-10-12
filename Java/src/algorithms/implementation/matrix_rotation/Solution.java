package algorithms.implementation.matrix_rotation;

import java.util.Scanner;

/**
 * Created by Miguel on 10/12/15.
 */
public class Solution {

    private static int[][] matrix;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int R = in.nextInt();
        matrix = new int[M][N];

        // Fill Matrix
        for (int i = 0; i < M; i++) for (int j = 0; j < N; j++) matrix[i][j] = in.nextInt();

        // Holders for the rectangles corners
        int c1i = 0, c1j = 0;
        int c2i = 0, c2j = N - 1;
        int c3i = M - 1, c3j = 0;
        int c4i = M - 1, c4j = N - 1;

        while (true) {

            // Calculate new R
            int R2 = R % ((c2j - c1j) * 2 + (c3i - c1i) * 2);

            // Rotate Rectangle 'R2' times
            rotateRectangle(c1i, c1j, c2i, c2j, c3i, c3j, c4i, c4j, R2);

            // Done?
            if (c2j - c1j == 1 || c3i - c1i == 1) break;

            // Calculate new corners
            c1i++;
            c1j++;
            c2i++;
            c2j--;
            c3i--;
            c3j++;
            c4i--;
            c4j--;

        }

        // Print final matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static void rotateRectangle(int c1i, int c1j, int c2i, int c2j, int c3i, int c3j, int c4i, int c4j, int R) {

        for (int i = 0; i < R; i++) {
            int currenti = c1i;
            int currentj = c1j;

            // Hold element of matrix
            int temp = matrix[currenti][currentj];

            // Rotate first line of rectangle
            while (currenti != c3i) {
                int temp2 = matrix[currenti + 1][currentj];
                matrix[currenti + 1][currentj] = temp;
                temp = temp2;
                currenti++;
            }

            // Rotate second line of rectangle
            while (currentj != c4j) {
                int temp2 = matrix[currenti][currentj + 1];
                matrix[currenti][currentj + 1] = temp;
                temp = temp2;
                currentj++;
            }

            // Rotate third line of rectangle
            while (currenti != c2i) {
                int temp2 = matrix[currenti - 1][currentj];
                matrix[currenti - 1][currentj] = temp;
                temp = temp2;
                currenti--;
            }

            // Rotate fourth line of rectangle
            while (currentj != c1j) {
                int temp2 = matrix[currenti][currentj - 1];
                matrix[currenti][currentj - 1] = temp;
                temp = temp2;
                currentj--;
            }
        }
    }
}
