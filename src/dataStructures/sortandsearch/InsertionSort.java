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

    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
