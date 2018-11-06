package week2.homework2;
//Вивести в консоль елементі тієї половини масиву, у якої середнє арифметичне максимальне.
import week2.ArrayUtils;

public class Task8 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 10);
        ArrayUtils.printArray(array);

        int left = 0;
        int right = 0;
        int halfArray = array.length / 2;

        for (int i = 0; i < halfArray; i++ ){
            left += array[i];
            right += array[array.length - i - 1];

        }
        System.out.println("");
    }
}
