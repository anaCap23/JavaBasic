package oop;

public class SortingAlgorithm {
    public static void main(String[] args) {
        int[] array = {1, 1, 5, 2, 2, 3, 4};
        // 1 1 2 2 3 4 5
//       insertionSorSort(array);
        bubbleSort(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1 ; i < array.length; i++) {
           int key = array[i];
           int j = i - 1;

           while (j>= 0 && array[j] > key) {
               array[j+1] = array[j];
               j--;
           }
           array[j + 1] = key;
        }
    }

    private static void bubbleSort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static void swap(int[] array, int index) {
        int temp = array[index];
        array[index] = array[index+1];
        array[index + 1] = temp;
    }
}
