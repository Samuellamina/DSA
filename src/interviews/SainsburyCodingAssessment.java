package interviews;

public class SainsburyCodingAssessment {
    public static void main(String[] args) {
        System.out.println(run(3));
    }

    public static String run(int size) {
       int start = (int) Math.pow(10, size - 1);
        int end = (int) Math.pow(10, size) - 1;

        StringBuilder res = new StringBuilder();

        for (int i = start; i <= end ; i++) {
            if (isNonDecreasing(i)) {
                res.append(i).append(", ");
            }

        }
        res.deleteCharAt(res.length() -2);

        System.out.println(res.toString());

        String result = "";
        return result;
    }

    private static boolean isNonDecreasing(int i) {
        int prevDigit = i % 10;
        i /= 10;
        while (i>0) {
            int currentNum = i % 10;
            if (currentNum>prevDigit)
                return false;
            prevDigit=currentNum;
            i/=10;
        }
        return true;
    }
}
