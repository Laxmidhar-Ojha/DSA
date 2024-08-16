import java.util.*;

public class BinToDec {
    public static int toDecimal(int n) {
        int i = 0;
        int sum = 0;
        while (n != 0) {
            int bit = n % 2;
            n = n / 10;
            if (bit == 1) {
                sum += (int) Math.pow(2, i);
            }
            i++;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toDecimal(n));
    }

}
