package week1.homework;

import java.util.Scanner;
/*Пользователь вводит параметр с консоли (текущий час от 0 до 24). Если время от 9 до 18, то выводим "Я на работе",
 в другом случае "Я отдыхаю")*/

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter an int:");
        int inputInt = sc.nextInt();

        int hour = sc.nextInt();

        if (hour >= 9 && hour <= 18) {
            System.out.print("I'm working");
        } else if (hour >= 18 && hour <= 23) {
            System.out.print("i'm resting!");
        } else {
            System.out.print("that's not an option!))");
        }
    }
}