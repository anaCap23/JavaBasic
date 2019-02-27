package week3.homework3;
/* а) Поміняти найбільшу та найменшу стрічку(масив) місцями в двовимірному масиві (розмір - сума елементів в масиві)
   б) Поміняти найбільший та найменший стовпчик в двовимірному масиві.*/

import week3.MatrixUtils;

public class Task5 {
    public static void main(String[] args) {

        int[][] matrix1 = MatrixUtils.generateMatrix(5, 8, 10);
        swapRows(matrix1);

        System.out.println();

        int[][] matrix2 = MatrixUtils.generateMatrix(5, 8, 10);
        swapColumns(matrix2);
    }

    private static void swapColumns(int[][] matrix) {
        System.out.println("Before columns swap");
        MatrixUtils.printMatrix(matrix);

        int maxColumnSum = 0;
        int minColumnSum = Integer.MAX_VALUE;
        int maxColumnIndex = 0;
        int minColumnIndex = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;

            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }

            if (sum > maxColumnSum) {
                maxColumnSum = sum;
                maxColumnIndex = i;
            }
            if (sum < minColumnSum) {
                minColumnSum = sum;
                minColumnIndex = i;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][minColumnIndex];
            matrix[i][minColumnIndex] = matrix[i][maxColumnIndex];
            matrix[i][maxColumnIndex] = temp;
        }

        System.out.printf("maxIndex %d, minIndex %d%n", maxColumnIndex, minColumnIndex);
        System.out.println("After columns swap:");
        MatrixUtils.printMatrix(matrix);
    }

    private static void swapRows(int[][] matrix) {
        System.out.println("Before rows swap");
        MatrixUtils.printMatrix(matrix);

        int maxRowSum = 0;
        int minRowSum = Integer.MAX_VALUE;
        int maxRowIndex = 0;
        int minRowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int sum = matrix[i][0];
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxRowSum) {
                maxRowSum = sum;
                maxRowIndex = i;
            }
            if (sum < minRowSum) {
                minRowSum = sum;
                minRowIndex = i;
            }
        }

        int[] tempRow = matrix[minRowIndex];
        matrix[minRowIndex] = matrix[maxRowIndex];
        matrix[maxRowIndex] = tempRow;

        System.out.printf("maxIndex %d, minIndex %d%n", maxRowIndex, minRowIndex);
        System.out.println("After rows swap:");
        MatrixUtils.printMatrix(matrix);
    }
}
