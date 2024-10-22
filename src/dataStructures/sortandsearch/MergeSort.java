package dataStructures.sortandsearch;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left+right) /2;
            // Recursively sort the two halves.
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves.
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays.
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        // Merge the temp arrays back into the original array.
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {arr[k++] = L[i++];} // desc: L[i] >= R[j].
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];  // Copy remaining elements from L.
        while (j < n2) arr[k++] = R[j++];  // Copy remaining elements from R.
    }
}