package week1.homework;

import java.util.Scanner;
/* Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.*/

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter an int:");
        int inputInt = sc.nextInt();
        int result = inputInt * 2;

        if (inputInt % 7 == 0) {
            System.out.println("your result is " + result);
        } else {
            System.out.println("sorry, wrong number)) ");
        }
    }
}