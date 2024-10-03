package dataStructures.arrays.exercises;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        System.out.println(findMissingNumberInArray(myArray));
    }

    static int findMissingNumberInArray(int[] arr) {
        int missingNumber = 0;
        int arrSum = 0;
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {
            arrSum = arr[i] + arrSum;
        }
        return sum - arrSum;
    }
}
