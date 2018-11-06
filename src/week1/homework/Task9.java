package week1.homework;

import java.util.Scanner;
/*  Ввести с клавиатуры значения трех сторон треугольника a, b и c
и определить, является ли он прямоугольным. Ответ вывести в виде сообщения.*/
 public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 3 nums");
        double a = sc.nextInt();
        //System.out.println("please enter a cathetus");
        double b = sc.nextInt();
        double c = sc.nextInt();

        if (Math.pow(Math.max(a, Math.max(b, c)), 2) == (Math.pow(a, 2) + (Math.pow(b, 2)))) {
            System.out.print("thats a rectangular triangle");
        } else {
            System.out.print("thats not a rectangular triangle!");
        }
    }
}