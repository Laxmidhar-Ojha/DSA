import java.util.*;

public class Prime {

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a any number greater than 1");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

}
