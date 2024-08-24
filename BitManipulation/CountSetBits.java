public class CountSetBits {

    public static void countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check lsb =1 or 0
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        countSetBits(63);
    }

}
