public class ReverseArray {

    public static void reverseArray(int nums[]) { // void because we dont have to return cuz array are pass by reference
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            nums[end] = nums[start] + nums[end];
            nums[start] = nums[end] - nums[start];
            nums[end] = nums[end] - nums[start];
            start++;
            end--;
        }

    }

    public static void main(String args[]) {
        int nums[] = { 23, 36, 43, 65, 24, 63, 24, 54, 543, 43, 54 };
        reverseArray(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
