package week1.homework;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter amaunt");
        int amaunt = sc.nextInt();
        int percent = (int)((amaunt / 100.0f) * 10);

        if(amaunt >= 1000){
            System.out.println("your discount is 10%. total cost will be " + (amaunt - percent));
        } else {
           System.out.println("you don't have discount!");
        }

    }
}
