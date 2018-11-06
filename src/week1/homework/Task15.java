package week1.homework;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("chouse a month)");
        int a = sc.nextInt();

        if (a >= 1 && a <= 2) {
            System.out.println("lets build a snowman! its winter!!)");
        }else if(a > 2 && a < 6){
            System.out.println("yey! its spring!");
        }else if (a >= 6 && a < 9) {
            System.out.println( "summertime sadness))" );
        }else if(a >= 9 && a <=11){
            System.out.println( "finally!!!! automn is here! the best time ever!" );
        } else {
            System.out.println("there's no month like that...where are you from");

    }
}



        }


