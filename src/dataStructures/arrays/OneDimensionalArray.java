package dataStructures.arrays;

import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        // declaration and initialization
        String[] arr = {"X", "Y", "Z", "B"};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 3, 4, 6, 7, 9, 2};

        // Array Operations
//        arrayTraversal(arr);
//        searchArray(arr2);
//        deleteElement(arr2);

        // sort array
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        bubbleSortArray(arr3);

        // minimum and mx element
        // minAndMaxArray(arr3);

        // partition array
        //partitionArray(arr3, 2);

//        mergeArrays(arr2, arr3);
//        sliceArray();
//        swappingElementsArray();
//        reverseArray(arr2);
//        streamArray(arr3);
//        rotateArray(arr2, 2);
//     binarySearchArray(arr3, 7);
//        maxSum(arr3, 4);
//        maxSubArray(arr3);
        combineArray(arr2, arr3);
    }

    public static void combineArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] + arr2[i];
        }
        System.out.println("combined array is: " + Arrays.toString(result));
    }

    // The Sliding Window Technique to find maxsum of a sub array
    private static void maxSum(int[] arr, int k) {
        int maxSum = 0; // Stores the maximum sum we have found so far
        int windowSum = 0; // Stores the current sum of the window

        // First, calculate the sum of the first window (first 'k' elements)
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Set the initial window sum as the maximum sum for now
        maxSum = windowSum;

        // Now, slide the window across the array
        for (int i = k; i < arr.length; i++) {
            /*Slide the window: Add the new element and remove the element that goes out of the window
            Add the next element, subtract the element that just went out of the window*/
            windowSum += arr[i] - arr[i - k];
            // Update the maximum sum if the new window sum is larger
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("max sum of subarray with sliding windows is: " + maxSum);
    }

    public static void maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        System.out.println("max sum of subarray with Kadane’s Algorithm is: " + maxSoFar);
    }

    private static void binarySearchArray(int[] arr, int target) {
        /*The search space is halved at each iteration. We calculate the middle element (mid) and
        compare it with the target. If the target is smaller, we move to the left half,
        and if it's larger, we move to the right half.*/
        int left = 0, right = arr.length - 1; // computes the middle index of the current search interval.

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("index found at: " + mid);
                return;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("index not found: " + -1);
    }

    private static void streamArray(int[] arr) {
        // using stream
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum of elements in array: " + sum);

        // using map to transform each element
        int[] squared = Arrays.stream(arr).map(x -> x * x).toArray();
        System.out.println("square of elements in array: " + Arrays.toString(squared));

        // using Filter: Keep only elements that match a condition.
        int[] even = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
        System.out.println("even numbers in array: " + Arrays.toString(even));
    }

    private static void rotateArray(int[] arr, int k) {
        k = k % arr.length; // Handle cases where k > arr.length // k is no of positions to rotate
        reverseArray(arr, 0, arr.length - 1); // reverse entire array
        reverseArray(arr, 0, k - 1); // reverses the first k elements of the array
        reverseArray(arr, k, arr.length - 1); // reverses the elements from index k to the end of the array
        System.out.println("rotated array: " + Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("reversed array: " + Arrays.toString(arr));
    }

    private static void swappingElementsArray() {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println("swapped :" + Arrays.toString(arr));
    }

    private static void sliceArray() {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] subArr = Arrays.copyOfRange(arr, 3, arr.length - 1);
        System.out.println("sub array: " + Arrays.toString(subArr));
    }

    private static void mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0; // Three pointers are initialized: i for arr1, j for arr2, and k for merged.

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) { //
                /*Copy the smaller element to merged[k] and increment
                the corresponding pointer (i or j) and k.*/
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++]; // If there are any elements left in arr1, copy them to merged
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++]; // If there are any elements left in arr2, copy them to merged
        }
        Arrays.sort(merged);
        System.out.println("merged array: " + Arrays.toString(merged));
    }

    private static void partitionArray(int[] arr, int pivot) {
        int i = 0; // starts at the beginning of the array
        int j = arr.length - 1; // starts at the end

        while (i <= j) {
            if (arr[i] <= pivot) {
                i++; // If the element at index i is less than or equal to the pivot, increment i
            } else if (arr[j] > pivot) {
                j--; // If the element at index j is greater than the pivot, decrement j
            } else {
                /*If neither of the above conditions is true, it means the element at i is greater than
                the pivot and the element at j is less than or equal to the pivot. In this case,
                swap the elements at i and j, then increment i and decrement j.*/
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println("use " + i + "to partition");
    }

    private static void minAndMaxArray(int[] arr3) {
        /*You start by assuming the first element is both the minimum and maximum,
        then loop through the array comparing each element with the current min/max
        and updating as needed.*/
        int min = arr3[0];
        int max = arr3[0];

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] < min) {
                min = arr3[i];
            }
            if (arr3[i] > max) {
                max = arr3[i];
            }
        }
        System.out.println("min is: "+ min +", max is: "+ max);
    }

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

    public static void arrayTraversal(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void searchArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 3) {
               System.out.println("Value is found at index: " + i);
           }
        }
    }

    public static void deleteElement(int[] arr) {
        arr[2] = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(arr));
    }
}
