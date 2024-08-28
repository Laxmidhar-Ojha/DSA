public class BinaryStr {

    public static void binaryStr(int n, int lp, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        binaryStr(n - 1, 0, str + 0);
        if (lp == 0) {
            binaryStr(n - 1, 1, str + 1);
        }
    }

    public static void main(String[] args) {
        binaryStr(6, 0, "");
    }

}
