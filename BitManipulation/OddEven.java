package BitManipulation;

public class OddEven {
    public static void oddEven(int n) {
        int maskBit = 1;
        if ((n & maskBit) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String args[]) {
        oddEven(11);
        oddEven(6);
        oddEven(12);
        oddEven(12);
    }

}
