import java.util.*;

public class GetIthBit {
    public static void getIthBit(int n, int i) {
        int maskBit = (int) Math.pow(2, i); // or you can write 1<<i
        if ((n & maskBit) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void main(String args[]) {
        getIthBit(11, 1);
    }
}