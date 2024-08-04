package dataStructures.arrays;

import java.util.Arrays;
import java.util.Objects;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] arr2 = {{"a", "b"}, {"c", "d"}};
        //search2dArray(arr2);
        traverse2dArray(arr2);
        //create2dArray();
    }

    public static void search2dArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) { // loops each row first // O(m)
            for (int j = 0; j < arr[0].length; j++) { // O(n)
                if(Objects.equals(arr[i][j], "b")) { // 0(1)
                    System.out.println("Value " + arr[i][j] + " is found at indices: "  + i +"," + j); // O(1)
                }
                } // time complexity is O(mn)
        }
    }

    public static void traverse2dArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) { // loops each row first
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
        }
    }

    public static void create2dArray() {
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        String[][] arr2 = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(arr2[0][1]);
    }
}
