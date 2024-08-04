import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(findTopTwoScores(arr)));
    }

    public static int[] findTopTwoScores(int[] array){
        int[] topScore = {0, 0};
        int max = Arrays.stream(array).max().getAsInt();
        topScore[0] = max;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > topScore[1] && array[i] < topScore[0]) {
                topScore[1] = array[i];
            }
        }
        return topScore;
    }

}