import java.util.*;

public class Basic {
    public static void runMat(int mat[][]) {
        Scanner sc = new Scanner(System.in);
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int mat[][], int x) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    System.out.println(x + " is in ( " + i + "," + j + " ) position");
                    return true;
                }

            }
        }
        System.out.println(x + " is not in the matrix");
        return false;
    }

    public static void main(String args[]) {
        int mat[][] = new int[4][4];
        runMat(mat);
        search(mat, 15);
    }
}
