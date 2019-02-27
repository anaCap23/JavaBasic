package week1.homework;

import java.util.Scanner;
/* Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0.*/

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

       if (a > 0) {
            System.out.println("^3 = " + (Math.pow(a, 3)));
        } else {
            System.out.println("0");
        }
        if (b > 0) {
            System.out.println("^3 = " + (Math.pow(b, 3)));
        } else {
            System.out.println("0");
        }
        if (c > 0) {
            System.out.println("^3 = " + (Math.pow(c, 3)));
        } else {
            System.out.println("0");
        }
    }
}