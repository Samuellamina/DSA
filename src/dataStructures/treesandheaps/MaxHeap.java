package dataStructures.treesandheaps;

import java.util.ArrayList;

public class MaxHeap {
    // In a Max Heap, for any given node NN, the value of NN
    // is greater than or equal to the values of its children.
    private ArrayList<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value); // Add the new value to the end
        int index = heap.size() - 1; // Index of the newly added element

        // Bubble up the new element
        while(index > 0) {
            int parentIndex = (index - 1) / 2;  // Calculate parent index
            if (heap.get(index) > heap.get(parentIndex)) {
                // Swap if the current value is greater than its parent
                int temp = heap.get(index);
                heap.set(index, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                index = parentIndex;
            } else {
                break;
            }
        }
    }
}
