public class PairArray {

    public static void pairArray(int nums[]) {
        int tp = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + " , " + nums[j] + ") ");
                tp++;
            }

            System.out.println();
        }
        System.out.println("Total pair = " + tp);
    }

    public static void main(String args[]) {
        int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24 };
        pairArray(nums);
    }
}
