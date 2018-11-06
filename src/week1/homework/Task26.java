package week1.homework;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        int counter = 0;

        while(number > 0) {
            counter = (number % 10 == 8) ? counter + 1 : counter;
            number = number / 10;
            }
            System.out.println("your number has " + counter + " eights!");
    }
}
