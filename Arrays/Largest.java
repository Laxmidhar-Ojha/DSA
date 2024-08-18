import java.util.*;

public class Largest {
    public static int largest(int nums[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;

    }

    public static void main(String args[]) {
        int nums[] = { 10, 20, 54, 78, 34, 87, 43, 75, 73, 2, 67, 98 };
        int largest = largest(nums);
        System.out.println("Largest number is " + largest);
    }

}
