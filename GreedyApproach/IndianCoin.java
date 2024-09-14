import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int amount = 1059;
        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= amount) {
                count++;
                ans.add(coins[i]);
                amount -= coins[i];
            }
            if (amount == 0) {
                break;
            }
        }
        System.out.println("Total coins " + count);
        System.out.println(ans);

    }

}
