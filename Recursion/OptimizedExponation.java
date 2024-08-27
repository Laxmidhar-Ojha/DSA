package Recursion;

public class OptimizedExponation {

    public static int fastExponent(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int ans = fastExponent(x, n / 2) * fastExponent(x, n / 2); this will not
        // reduce the time complexity
        int ans = fastExponent(x, n / 2);
        ans *= ans;
        if (n % 2 == 1) {
            ans = ans * x;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = fastExponent(2, 9);
        System.out.println(n);
    }

}
