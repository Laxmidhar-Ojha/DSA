import java.util.*;

public class SolidRomb {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
