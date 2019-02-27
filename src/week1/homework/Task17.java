package week1.homework;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your hight");
        int hight = sc.nextInt();
        System.out.println("please enter your weight");
        int weight = sc.nextInt();
        int pw = hight - weight;

        if(pw >= 98 && pw <= 102) {
            System.out.println("your weight is fine!");
        } else if (pw <= 97){
            System.out.println("you need to lose some waight");
        } else {
            System.out.println("you need to put on some weight");
        }
    }
}