public class FriendsPairing {
    public static int pairFrnd(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return pairFrnd(n - 1) + (n - 1) * pairFrnd(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairFrnd(25));

    }

}
