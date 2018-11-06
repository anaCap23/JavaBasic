package week2.homework2;

import week2.ArrayUtils;

//10. Створити 2 масиви з випадковими числами від 25 до 75. Визначити, в якого з них більше парних елементів.
public class Task10 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtils.generateArray(10, 20);
        int[] arr2 = ArrayUtils.generateArray(10, 20);

        ArrayUtils.printArray(arr1);
        ArrayUtils.printArray(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.println(i);
            } else {
                System.out.println("not found");
            }

        }
    }
}
