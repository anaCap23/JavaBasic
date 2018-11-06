package week3;

public class MatrixUtils {

    public static int[][] generateMatrix(int lengthOuter,
                                         int lengthInner,
                                         int limit) {
        int[][] resultArray = new int[lengthOuter][lengthInner];

        for (int i = 0; i < lengthOuter; i++) {
            int[] innerArray = resultArray[i];

            for (int j = 0; j < lengthInner; j++) {
                double random = Math.random();
                int element = (int) (limit * random);

                innerArray[j] = element;
            }
        }

        return resultArray;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int[] innerArray = array[i];

            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(innerArray[j] + " ");
            }
            System.out.print("\n");
        }
    }
}