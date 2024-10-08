public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // if (i == n - 1 && j == m - 1) {
        // return 1;
        // }
        if (i == n - 1 || j == m - 1) {
            return 1;
        }
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.println(gridWays(0, 0, n, m));
    }

}

// this will give tc=O(2 pow m+n). so optimized code will be by using factorial