import java.util.*;

public class KadensAlgo {

    public static void kadensAlgo(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        if (maxSum == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            System.out.println(max);
        } else {
            System.out.println(maxSum);
        }
    }

    public static void main(String args[]) {
        int nums[] = { -2, -3, -4, -2, -3, -5, -3, 0 };
        kadensAlgo(nums);
    }

}
