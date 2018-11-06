package week1.homework;

import java.util.Scanner;
/* Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1*/
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a double:");
        double inputDouble = sc.nextDouble();

        if (inputDouble >= 0 && inputDouble <= 1) {
            System.out.println("your number is less then 1, but more then 0");
        } else {
            System.out.println("yup, your num is not between 0 and 1!)");
        }
    }
}