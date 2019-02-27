package week2.homework2;

import java.util.Scanner;

//Написати метод, який буде обрізати масив по заданому початковому та кінцевому індексу.
//	public static int[] splitArray(int[] arr, int start, int end)
//		{ // обрезать массив по границам start и end)
//		}
public class Task11 {
    public static int[] splitArray(int[] arr, int start, int end) {
        int[] renew = new int[arr.length - end];

        for (int i = 0; i < renew.length ; i++) {
            renew[i] = (renew.length + i);
        }
      return renew;
    }
}
