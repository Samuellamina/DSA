package dataStructures.arrays.exercises;

import java.util.Arrays;

public class ReturnTopTwoScores {

    public static void main(String[] args) {
        int[] scores = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] result = findTopTwoScores(scores);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] findTopTwoScores(int[] array) {
        int[] topTwo = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (topTwo[0] < array[i]) {
                topTwo[0] = array[i];
                //90
            }

            if (array[i] < topTwo[0] && array[i] > topTwo[1]) {
                topTwo[1] = topTwo[0];
            }

        }

        return topTwo;
    }




}
