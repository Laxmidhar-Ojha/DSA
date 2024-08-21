public class DiagonalSum {

    public static void diagonalSum(int nums[][]) {
        int n = nums.length;
        int sum = 0;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) { this meathod is full bruteforce and it will
        // give a time complaxityof
        // if (i == j) { big oh of n2
        // sum += nums[i][j];
        // }
        // if (i + j == n - 1 && i != j) {
        // sum += nums[i][j];
        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            sum += nums[i][i];
            if (i != n - 1 - i) {
                sum += nums[i][n - 1 - i];
            }
        }
        System.out.println(sum);

    }

    public static void main(String args[]) {
        int nums[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        diagonalSum(nums);
    }

}
