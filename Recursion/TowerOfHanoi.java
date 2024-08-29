public class TowerOfHanoi {

    public static void tower(int n, String src, String hel, String dest) {
        if (n == 1) {
            System.out.println("transfer " + n + " from " + src + " to " + dest);
            return;
        }
        tower(n - 1, src, dest, hel);
        System.out.println("transfer " + n + " from " + src + " to " + dest);
        tower(n - 1, hel, src, dest);
    }

    public static void main(String[] args) {
        tower(3, "A", "B", "C");
    }

}
