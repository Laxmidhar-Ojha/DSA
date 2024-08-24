public class ClearLastIBits {

    public static int clearLastIBits(int n, int i) {
        int maskBit = (~0) << i;
        return n & maskBit;
    }

    public static void main(String args[]) {
        int x = clearLastIBits(15, 2);
        System.out.println(x);
    }
}