package week3.homework3;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a word!");
        String palindrome = sc.nextLine();

        char[] chars = palindrome.toCharArray();

        boolean isPalindrome = true;
        for (int i = 0; i < chars.length / 2 && isPalindrome; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                isPalindrome = false;
            }
        }

        System.out.println(isPalindrome);
    }
}


