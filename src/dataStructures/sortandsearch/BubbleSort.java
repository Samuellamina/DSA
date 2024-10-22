package dataStructures.sortandsearch;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSortArray(int[] arr) {
        int n = arr.length;
        /* outer loop: runs the array multiple times
         This loop controls how many passes we will make through the array.
         Each time we go through, one element is placed in its correct position at the end of the array,
         so we do n-1 passes in total.*/
        for (int i = 0; i < n - 1; i++) {
            /* inner loop: performs the comparisons and swapping
             This loop goes through the array and compares adjacent elements.
             It runs fewer comparisons with each iteration of the outer loop because the largest elements
             are already in place by the end of the array.*/
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

    }
}
