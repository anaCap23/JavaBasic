package week3.homework3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        String[] names = name.split(" ");

        for (int i = 0; i < names.length; i++) {
            String firstLetter = names[i].substring(0, 1).toUpperCase();
            System.out.print(firstLetter + names[i].substring(1).toLowerCase() + " ");
        }
    }
}