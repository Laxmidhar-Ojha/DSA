import java.util.*;

public class MaxSubArr {

    public static void subArray(int num[]) {
        int ts = 0;
        int sum;
        int largestSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + num[k];
                }
                if (largestSum < sum) {
                    largestSum = sum;
                }
                System.out.print("   sum= " + sum);
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays =" + ts);
        System.out.println("Largest subarray sum =" + largestSum);

    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        subArray(numbers);
    }
}
