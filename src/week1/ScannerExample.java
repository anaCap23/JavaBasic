package week1;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a string:");
        String inputString = sc.nextLine();
        System.out.println("My input " + inputString);

        System.out.println("Please, enter an int:");
        int inputInt = sc.nextInt();
        System.out.println("My input " + inputInt);

        System.out.println("Please, enter a double:");
        double inputDouble = sc.nextDouble();
        System.out.println("My input " + inputDouble);
    }
}