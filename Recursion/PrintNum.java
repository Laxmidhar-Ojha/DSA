import java.util.*;

public class PrintNum {

    public static void print(int n) {
        if (n >= 0) {
            System.out.println(n);
            print(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }
}
