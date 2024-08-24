package BitManipulation;

public class SetIthBit {
    public static void setIthBit(int n, int i) {
        int bitmask = (1 << i);
        System.out.println(n | bitmask);
    }

    public static void main(String args[]) {
        setIthBit(4, 3);
    }
}
