package week3.homework3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        String[] names = name.split(" ");

        for[int i = 0; i < names.length; i++]
        String s1 = name.substring(0, 1).toUpperCase();
        String nameCapitalized = s1 + name.substring(1);
        names[i] = nameCapitalized;
        
        System.out.println(nameCapitalized);

    }
}