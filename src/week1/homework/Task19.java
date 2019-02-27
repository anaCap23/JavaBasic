package week1.homework;

import java.util.Scanner;
/* 19. Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет к нему слово "копейка"
в правильной форме. Например, 1 копейка, 5 копеек, 42 копейки. */
public class Task19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter num of coins");
        int coins = sc.nextInt();

        if(coins >= 1 && coins <= 2) {
            System.out.println(coins + " coin");
        } else {
            System.out.println(coins + " coins");
        }
    }
}
