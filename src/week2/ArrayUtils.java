package week2;

public class ArrayUtils {
    public static void main(String[] args) {
        int myArr[] = generateArray(10, 99);
        printArray(myArr);
    }

    public static int[] generateArray(int length, int limit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random();
            int element = (int) (limit * random);
            resultArray[i] = element;
        }
        return resultArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}