package interviews;

public class OppositeNumber {
    public static int getOpposite(int number) {
        return -number;
    }

    public static void main(String[] args) {
        int number = 10;
        int negativeNumber = getOpposite(number);
        System.out.println("Original number: " + number);
        System.out.println("Negative number: " + negativeNumber);
    }
}
