package week3.homework3;
// Створити масив, який буде представляти собою діагональ матриці.
//		1 3 5
//		4 5 7  -  1 5 6
//		4 5 6

import week2.ArrayUtils;
import week3.MatrixUtils;

public class Task4 {
    public static void main(String[] args) {

        int[][] matrix = MatrixUtils.generateMatrix(4, 4, 9);
        MatrixUtils.printMatrix(matrix);
        int[] diagonal = new int[4];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    diagonal[i] = matrix[i][j];
                    break;
                }
            }
        }

        System.out.println("Diagonal:");
        ArrayUtils.printArray(diagonal);
    }
}