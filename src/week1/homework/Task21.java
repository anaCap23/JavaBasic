package week1.homework;

import java.util.Scanner;

/*Даны три числа A,B,C. Увеличить числа в два раза, если A+B+C>0, в противном случае заменить на нули.*/
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a + b + c) > 0) {
            System.out.println("your numbs X2" + (a * 2) + (b * 2) + (c * 2));
        } else {
            System.out.println("0, 0, 0");
        }
    }
}
