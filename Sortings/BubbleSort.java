public class BubbleSort {

    public static void bubbleSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swap = false; // checking wheather the array have already beens sorted
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        bubbleSort(nums);
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i]);
        }

    }
}
