package week2.homework2;
// Поміняти місцями найбільший і найменший елемент в масиві.

import week2.ArrayUtils;

public class Task3 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 99);
        ArrayUtils.printArray(array);

        int min = array[0];
        int max = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            } else if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        array[maxIndex] = min;
        array[minIndex] = max;
        ArrayUtils.printArray(array);
    }
}
