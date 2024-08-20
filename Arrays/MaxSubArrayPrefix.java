import java.util.*;

public class MaxSubArrayPrefix {

    public static void maxSubArrayPrefix(int nums[]) {
        int prefix[] = new int[nums.length];
        int largestSum = Integer.MIN_VALUE;
        int currSum;
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (largestSum < currSum) {
                    largestSum = currSum;
                }
            }
        }
        System.out.println("Max subassay = " + largestSum);
    }

    public static void main(String args[]) {
        int nums[] = { 1, -2, 6, -1, 3 };
        maxSubArrayPrefix(nums);
    }
}
