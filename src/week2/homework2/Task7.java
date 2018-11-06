package week2.homework2;

import week2.ArrayUtils;

//Знайти середнє арифметичне масиву
public class Task7 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 20);
        ArrayUtils.printArray(array);
        int total = 0;

        for(int element : array) {
            total += element;
        }
        System.out.println("Середнє массива array: " + (total / array.length));
    }
}