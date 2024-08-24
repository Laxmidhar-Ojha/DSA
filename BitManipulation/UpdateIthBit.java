package BitManipulation;

public class UpdateIthBit {

    public static int clearIthBit(int n, int i) {
        int bitmask = (1 << i);
        return n & ~bitmask;
    }

    public static int updateIthBit(int n, int i, int newbit) {
        n = clearIthBit(n, i);
        int maskBit = newbit << i;
        return n | maskBit;
    }

    public static void main(String args[]) {
        int n = updateIthBit(10, 2, 1);
        System.out.println(n);
    }

}
