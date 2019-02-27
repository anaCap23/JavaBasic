
package week3.homework3;
//. Замінити всі числа, що діляться на 5 без остачі в двовимірній матриці на 8.

import week3.MatrixUtils;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int[][] matrix = MatrixUtils.generateMatrix(rows, columns, 10);
        MatrixUtils.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                int element = matrix[i][j];

                if (element % 5 == 0) {
                    matrix[i][j] = 8;
                }
            }
        }

        System.out.println("Loading...");
        MatrixUtils.printMatrix(matrix);
    }
}
