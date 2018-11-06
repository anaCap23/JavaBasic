package week2.homework2;
// Дано два масиви однакової довжини з будь-якими значеннями. Скопіювати дані з першого масиву в другий.
import week2.ArrayUtils;

public class Task4 {
    public static void main(String[] args){

        int[] arr1 = ArrayUtils.generateArray(5, 10);
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            int element = arr1[i];
            arr2[arr1.length - i - 1] = element;
        }
    }

}
