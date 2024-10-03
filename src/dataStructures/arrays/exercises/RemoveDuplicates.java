package dataStructures.arrays.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }

    public static int[] removeDuplicates(int[] arr) {
        List<Integer> arrlist
                = new ArrayList<Integer>();
        int[] newArray = new int[0];
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value || arr[i] < value) {
                value = arr[i];
                arrlist.add(value);
                newArray = addElement(newArray, value);
            }
        }
        return newArray;
    }

    static int[] addElement(int[] a, int e) {
        a  = Arrays.copyOf(a, a.length + 1);
        a[a.length - 1] = e;
        return a;
    }
}
