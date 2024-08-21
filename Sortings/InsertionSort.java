public class InsertionSort {

    public static void insertionSort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i + 1];
            while (i >= 0 && nums[i] > curr) {
                nums[i + 1] = nums[i];
                i--;
            }
            nums[i + 1] = curr;
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) {
        int nums[] = { 3, 6, 34, 7, 2, 8, 654 };
        insertionSort(nums);
        printArr(nums);
    }

}
