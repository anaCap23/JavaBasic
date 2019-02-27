package week1.homework;

import java.util.Scanner;
/*  20. Написать программу, которая в зависимости от характера ветра выдает сообщение о его скорости
от 1до 4 м/с - слабый (1); от 5-10 м/c - умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
 */

public class Task20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a type of the wind (Calm, Gale, Storm, Hurricane)");
        String type = sc.nextLine();

        if(type.equals("calm") || type.equals("Calm")){
            System.out.println("the wind is calm, and its speede is 1 - 4m/s");
        } else if(type.equals("gale") || type.equals("Gale")){
            System.out.println("the wind is gale, and its speede is 5 - 10m/s");
        } else if(type.equals("storm") || type.equals("Storm")){
            System.out.println("the wind is stormy, and its speede is 9 - 18m/s");
        } else if(type.equals("Hurricane") || type.equals("hurricane")){
            System.out.println("get to hell out there! its hurricane! more then 19m/s))");
        } else {
            System.out.println("there is something wrong!");
        }

        }
}
