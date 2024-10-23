package dataStructures.sortandsearch;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
         quickSort(arr, low, pi - 1);
         quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    static int[] quickSort(int[] arr) {
        int pivotValue = arr[0];
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivotValue) {
                left.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }
        printArray(left);
        System.out.print(pivotValue + " ");
        printArray(right);
        return new int[0];
    }

    private static void printArray(List<Integer> ar) {
        for(int n: ar){
            System.out.print(n + " ");
        }
    }
}
