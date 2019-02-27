package week2.homework2;

import week2.ArrayUtils;

import static week2.ArrayUtils.printArray;

//10. Створити 2 масиви з випадковими числами від 25 до 75. Визначити, в якого з них більше парних елементів.
public class Task10 {
    public static void main(String[] args) {

        int[] firstArray = ArrayUtils.generateArray(10, 50);
        ArrayUtils.printArray(firstArray);

        int[] secondArray = ArrayUtils.generateArray(10, 50);
        ArrayUtils.printArray(secondArray);

        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] % 2 == 0) counter1++;
            if (secondArray[i] % 2 == 0) counter2++;
        }

        if (counter1 > counter2) {
            System.out.println("first");
        } else if (counter1 < counter2) {
            System.out.println("second");
        } else {
            System.out.println("equ");
        }

    }
    public static int[] generateArray ( int size, int limit){

        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++) {
            int randome = (int) (Math.random() + 25);
            resultArray[i] = randome;
        }
        return resultArray;

        }
    }