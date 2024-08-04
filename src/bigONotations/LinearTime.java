package bigONotations;

public class LinearTime {
    public static void main(String[] args) {
        int[] array = {1, 2 , 3 , 4 ,5};
        printElements(array); // This is O(n) - because the number of operations
        // depends on the input size
    }

    public static void printElements(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
