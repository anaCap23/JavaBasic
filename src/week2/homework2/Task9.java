package week2.homework2;

import week2.ArrayUtils;

//ано два масиви однакової довжини arr1 i arr2. Вивести в консоль значення масиву, який отримаємо в результаті arr1[i] + arr2[i]
public class Task9 {
    public static void main(String[] args) {

        int[] arr1 = ArrayUtils.generateArray(10, 50);
        int[] arr2 = ArrayUtils.generateArray(10, 50);
        int[] res = new int[arr1.length];
        ArrayUtils.printArray(arr1);
        ArrayUtils.printArray(arr2);

        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] + arr2[i];
        }
        System.out.println(res);

    }
}