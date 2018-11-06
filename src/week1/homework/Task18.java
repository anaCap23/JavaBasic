package week1.homework;
/* 18. Написать программу вычисления стоимости переговоров, если по субботам и воскресеньям предоставляется 20% скидка.
 Ввести продолжительность разговора и день недели (цифра от 1 до 7). */
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter day of week (1-7)");
        int day = sc.nextInt();
        System.out.println("please enter hours");
        int hours = sc.nextInt();
        int hourCost = 100;
        int percent = (int) ((hourCost / 100.0f) * 10);

        if (day >= 6 && day <= 7){
            System.out.println(1  + hours * hourCost - percent + "$");
        } else if(day >= 1 && day <= 5){
            System.out.println("sorry, no discount! total cost:" + hours * hourCost + "$");
        }else{
            System.out.println("sorry, there is something wrong!");
        }
    }
}
