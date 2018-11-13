package week3.homework3;
//Створити логічну матрицю з наступними критеріями: якщо i дорівнює j, то елементом має бути true.
import week3.MatrixUtils;

public class Task2 {
    public static void main(String[] args) {

        boolean bool[][] = new boolean[4][4];

        for (int i = 0; i < bool.length; i++) {

            for (int j = 0; j < bool[i].length; j++) {

                if (i == j) {
                    bool[i][j] = true;
                }
            }
        }
    }
}