package week1.homework;

import java.util.Scanner;
/* Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее */

public class Task2 {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c) {
            System.out.println("max numb is " + a);
        } else if (b > a && b > c) {
            System.out.println("max numb is " + b);
        } else {
            System.out.println("max numb is " + c);
        }

        if(a < b && a < c){
            System.out.println("min numb is " + a);
        } else if (b > a && b > c){
            System.out.println("min numb is " + b);
        } else {
            System.out.println("min numb is " + c);
        }
    }
    }

