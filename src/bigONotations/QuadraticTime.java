package bigONotations;

public class QuadraticTime {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        printPairs(array); // THis is O(n^2) -
        // runtime grows quadratically with the size of the input.
    }

    public static void printPairs (int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
