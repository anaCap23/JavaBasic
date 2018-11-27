package week3.homework3;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pleas, enter a word!");
        String palindrome = "okko"; //sc.nextLine();

        //palindrome - to lowercase- toCharArray
        palindrome = palindrome.toLowerCase();
        char[] charPalindrome = palindrome.toCharArray();

        //if 1st == last (cycle)
        for (int i = 0; i < (charPalindrome.length / 2) - 1; i++) {

            if (charPalindrome[i] != (charPalindrome[charPalindrome.length - 1 - i])) {
                System.out.println("it is not a palindrome(((");
                break;

            } else {

                System.out.println("This is a palindrome!" + palindrome);
            }
        }
    }
}


