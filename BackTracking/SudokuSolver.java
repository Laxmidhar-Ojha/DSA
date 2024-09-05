public class SudokuSolver {

    public static boolean isSafe(int arr[][], int row, int col, int digit) {
        for (int i = 0; i < 8; i++) {
            if (arr[i][col] == digit) {
                return false;
            }
        }
        for (int j = 0; j < 8; j++) {
            if (arr[row][j] == digit) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int arr[][], int row, int col) {

        if (row == 9) {
            return true;
        }
        int nxtrow = row, nxtcol = col + 1;
        if (col == 8) {
            nxtrow = row + 1;
            nxtcol = 0;
        }
        if (arr[row][col] != 0) {
            return sudokuSolver(arr, nxtrow, nxtcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(arr, row, col, digit)) {
                arr[row][col] = digit;
                if (sudokuSolver(arr, nxtrow, nxtcol)) {
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if (sudokuSolver(sudoku, 0, 0)) {
            print(sudoku);
        }
        ;
    }

}
