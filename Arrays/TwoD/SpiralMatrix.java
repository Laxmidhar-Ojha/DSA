public class SpiralMatrix {

    public static void spiralMatrix(int mat[][]) {
        int sr = 0; // starting row
        int sc = 0; // starting column
        int er = mat.length - 1; // ending row
        int ec = mat[0].length - 1; // ending column
        while (sr <= er && sc <= ec) {
            // upper bound
            for (int j = sc; j <= ec; j++) {
                System.out.print(mat[sr][j] + " ");
            }
            // right bound
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(mat[i][ec] + " ");
            }
            // bottom bound
            if (sr < er) {
                for (int j = ec - 1; j >= sc; j--) {
                    System.out.print(mat[er][j] + " ");
                }
            }

            // left bound
            if (sc < ec) {
                for (int i = er - 1; i >= sr + 1; i--) {
                    System.out.print(mat[i][sc] + " ");
                }
            }

            sr++;
            sc++;
            er--;
            ec--;
        }

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 12, 13, 14, 5 },
                { 11, 16, 15, 6 },
                { 10, 9, 8, 7 } };

        int mat[][] = { { 1, 2, 3, 4, 5 } };
        spiralMatrix(mat);

    }

}
