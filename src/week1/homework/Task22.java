package week1.homework;
/*Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).*/
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a numb, to see if its lucky");
        int numb = sc.nextInt();
        int first = numb % 10;
        int second = numb % 100;
        int third = numb % 1000;
        int fourth = numb % 10000;
        int fifth = numb % 100000;
        int sixth = numb % 1000000;

        if((first + second +third) == (fourth + fifth + sixth)){
            System.out.println("you have got the right numb!");
        } else {
            System.out.println("not lucky today(("  + ((first + second +third) != (fourth + fifth + sixth)));
        }

    }
}
