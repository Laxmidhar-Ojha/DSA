import java.util.*;

public class SubArray {

    public static void subArray(int num[]) {
        int ts = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k]);
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays =" + ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArray(numbers);
    }
}
