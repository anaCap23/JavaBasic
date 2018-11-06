package week1.homework;

import java.util.Scanner;
/* Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.*/

public class Task6 {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a + b <= 19 && a + b >= 11){
            System.out.println(a + b);
        } else {
            System.out.println("a + b != 11-19");
        }
        }
    }