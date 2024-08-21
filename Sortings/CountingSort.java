public class CountingSort {

    public static void countingSort(int nums[]) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void main(String args[]) {
        int nums[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        countingSort(nums);
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i]);
        }

    }

}
