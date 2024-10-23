package dataStructures.sortandsearch;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Start from the second element and go through each element
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Shift elements of the sorted part that are greater than key.
            while (j >= 0 && arr[j] > key) { // desc = arr[j] < key
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void insertionSort1(int n, int[] arr) {
        int elementToSort = arr[n];
        int index = n;
        while (index > 0) {
            if (arr[index - 1] < elementToSort) {
                break;
            }
            arr[index] = arr[index - 1];
            // printArray(arr); Now we don't need to print here.
            index--;
        }
        arr[index] = elementToSort;
        printArray(arr);
    }

    static void insertionSort2(int n, int[] arr) {
        // It doesn't make sense to start at index 0, as we will not
        // need to move anything.
        for (int i = 1; i < arr.length; i++) {
            insertionSort1(i, arr);
        }
    }


    private static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
