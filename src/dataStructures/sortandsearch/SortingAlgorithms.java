package dataStructures.sortandsearch;

import java.util.Arrays;

import static dataStructures.sortandsearch.InsertionSort.insertionSort;
import static dataStructures.sortandsearch.MergeSort.mergeSort;
import static dataStructures.sortandsearch.QuickSort.quickSort;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {3, 7, 12, 2};
        //insertionSort(arr);
        mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
