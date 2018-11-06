package week1.homework;

import java.util.Scanner;

/*Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна пара равных*/
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter 3 numbers:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first == second || second == third || first == third) {
            System.out.println("hey, all the numb are the same!");
        } else {
            System.out.println("Please, try agan!");
        }
    }
}