package dataStructures.treesandheaps;
import java.util.ArrayList;

public class Heaps {
    private ArrayList<Integer> heap; // This will store the elements of the heap

    // Constructor to initialize the heap
    public Heaps() {
        heap = new ArrayList<>();
    }

    // Method to insert a new value into the max heap
    public void insert(int value) {
        heap.add(value); // Add the new value at the end of the heap
        bubbleUp(heap.size() - 1); // Bubble up to maintain heap property
    }

    // Bubble up the newly added element to restore the heap property
    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2; // Calculate the parent index
            if (heap.get(index) > heap.get(parentIndex)) {
                // Swap if the current element is greater than its parent
                swap(index, parentIndex);
                index = parentIndex; // Move up the index
            } else {
                break; // Stop if the heap property is satisfied
            }
        }
    }

    // Method to extract the maximum element from the max heap
    public int extractMax() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap.get(0); // The root is the maximum
        int lastElement = heap.remove(heap.size() - 1); // Remove the last element

        if (heap.size() > 0) {
            heap.set(0, lastElement); // Move the last element to the root
            bubbleDown(0); // Restore the heap property
        }

        return max; // Return the maximum value
    }

    // Bubble down the root to maintain heap property
    private void bubbleDown(int index) {
        int leftChildIndex = 2 * index + 1; // Calculate left child index
        int rightChildIndex = 2 * index + 2; // Calculate right child index
        int largestIndex = index; // Initialize largest as root

        // Compare with left child
        if (leftChildIndex < heap.size() && heap.get(leftChildIndex) > heap.get(largestIndex)) {
            largestIndex = leftChildIndex;
        }
        // Compare with right child
        if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(largestIndex)) {
            largestIndex = rightChildIndex;
        }
        // Swap if the largest is not the current
        if (largestIndex != index) {
            swap(index, largestIndex); // Swap values
            bubbleDown(largestIndex); // Continue bubbling down
        }
    }

    // Helper method to swap two elements in the heap
    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    // Method to perform heap sort on an array
    public void heapSort(int[] arr) {
        // Step 1: Build the heap
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
        // Step 2: Extract elements from the heap
        for (int i = arr.length - 1; i > 0; i--) {
            // Swap the root (max element) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Helper method to heapify a subtree rooted with index i
    private void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Method to get the current elements in the heap
    public ArrayList<Integer> getHeapElements() {
        return heap; // Return the current heap elements
    }

    // Main method to test the heap operations
    public static void main(String[] args) {
        Heaps maxHeap = new Heaps();

        // Insert elements into the heap
        maxHeap.insert(10);
        maxHeap.insert(15);
        maxHeap.insert(20);
        maxHeap.insert(17);

        System.out.println("Heap Elements after Insertions: " + maxHeap.getHeapElements());

        // Extract max
        int max = maxHeap.extractMax();
        System.out.println("Extracted Max: " + max);
        System.out.println("Heap Elements after Extraction: " + maxHeap.getHeapElements());

        // Array to sort using heap sort
        int[] arr = {3, 5, 1, 10, 2};
        maxHeap.heapSort(arr);
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
