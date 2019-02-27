package week1.homework;
/*Известны две скорости, одна в километрах в час, другая в метрах в секунду. Какая из них больше?*/

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a speed in km/h.");
        double kmhour = sc.nextDouble();
        System.out.println("please enter a speed in m/s");
        double ms = sc.nextDouble();
        double msToKmhour = ((kmhour * 1000) / 3600);

        if (ms > msToKmhour) {
            System.out.println(ms + "is bigger");
        } else if (msToKmhour > ms) {
            System.out.println(msToKmhour + "is bigger");
        } else {
            System.out.println(ms + " = " + msToKmhour);
        }
    }
}