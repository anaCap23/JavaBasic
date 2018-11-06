package week1.homework;

import java.util.Scanner;
/* 7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем
 результат деления (целую часть от деления  и остачу), в другом случае выводим false и показываем
 результат деления (целую часть от деления  и остачу)*/
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 2 nums");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int rest = num1 % num2;

        if (num1 % num2 == 0) {
            System.out.println("true. there is no rest:" + num1 / num2);
        } else {
            System.out.println("false. " + num1 / num2 + "the rest is " + rest);
        }
    }
}