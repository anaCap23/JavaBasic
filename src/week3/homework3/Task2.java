package week3.homework3;
//Створити логічну матрицю з наступними критеріями: якщо i дорівнює j, то елементом має бути true.
import week3.MatrixUtils;

public class Task2 {
    public static void main(String[] args) {
        int [][] matrix = MatrixUtils.generateMatrix(4, 2, 10);
                    MatrixUtils.printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[j].length; j++) {
                if (i == j) {
                    System.out.println("true");
                }
            }
        }
    }
}

