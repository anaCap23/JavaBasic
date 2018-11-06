package week1.homework;

import java.util.Scanner;
/* дим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
Если второе больше, то выводим сумму. */

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.print(a - b);
        } else {
            System.out.print(a + b);
        }
    }
}