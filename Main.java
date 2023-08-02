import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] firstArr = {1, 2, 3, 5};

        System.out.println("The missing number for first array is " + getMissingNumberForFirstArray(firstArr));
        System.out.println();


        int[] secondArr = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("The missing number for second array is " + getMissingNumberForSecondArray(secondArr));
        System.out.println();
    }

    public static int getMissingNumberForFirstArray(int[] firstArr) {
        int n = firstArr.length;

        int m = n + 1;

        int total = m * (m + 1) / 2;

        int sum = Arrays.stream(firstArr).sum();

        return total - sum;


    }

    public static int getMissingNumberForSecondArray(int[] secondArr) {
        int n = secondArr.length;

        int m = n + 1;

        int total = m * (m + 1) / 2;

        int sum = Arrays.stream(secondArr).sum();

        return total - sum;
    }


}
