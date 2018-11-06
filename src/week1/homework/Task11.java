package week1.homework;

/*Дано трехзначное число. Определить:
	а) верно ли, что все его цифры одинаковые;
	б) есть ли среди его цифр одинаковые.*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a numbers (123, 258...like)");
        int numb = sc.nextInt();
        int first = numb % 10;
        int second = numb % 100;
        int third = numb % 1000;

        if(first == second && first == third) {
            System.out.println("hey, all the numb are the same!");
        } else if (first == second || second == third || first == third) {
            System.out.println("there's same numb in a numb!");
        } else {
            System.out.println("Please, try agan!");
        }

    }
}