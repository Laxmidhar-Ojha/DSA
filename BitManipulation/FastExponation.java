public class FastExponation {

    public static void fastExponation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        fastExponation(2, 14);
    }

}
