package dataStructures.arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        String[] arr = {"x", "Y", "Z", "B"};
        int[] arr2 = {1, 2, 3, 4, 5};
        arrayTraversal(arr);
        searchArray(arr2);
        deleteElement(arr2);
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
        System.out.println(java.util.Arrays.toString(arr));
    }
}
