package week2.homework2;

import week2.ArrayUtils;

import java.util.Scanner;

//Порахувати, скільки разів зустрічається число (число задає користувач) в масиві.
public class Task5 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 20);
        ArrayUtils.printArray(array);
        Scanner sc = new Scanner(System.in);

        System.out.println("please, enter a number");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if (number == array[i]){
                sum++;

            }
        }
        System.out.println(sum);
    }
}
