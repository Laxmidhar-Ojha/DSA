import java.util.*;

public class InvertedPyra {
    public static void makepyra(int row, int col) {
        int duplicate = col;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (j >= duplicate) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            duplicate--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        makepyra(rows, cols);
    }

}
