package BitManipulation;

public class ClearIthBit {
    public static void clearIthBit(int n, int i) {
        int bitmask = (1 << i);
        System.out.println(n & ~bitmask);
    }

    public static void main(String args[]) {
        clearIthBit(10, 1);
    }

}
