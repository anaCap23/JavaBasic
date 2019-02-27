package week2.homework2;
//Знайти мінімальне і максимальне значення в масиві, вивести їх в консоль

import week2.ArrayUtils;

public class Task2 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 20);
        ArrayUtils.printArray(array);

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
         System.out.println(min + " " + max);
    }

}
