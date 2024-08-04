package bigONotations;

public class ConstantTime {
    public static void main(String[] args) {
        int[] array = {1, 2 ,3 ,4 ,5};
        int element = array[3]; // this is O(1) - only one operation regardless of input size
        System.out.println(element);
    }
}
