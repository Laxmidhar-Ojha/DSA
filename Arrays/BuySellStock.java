import java.util.*;

public class BuySellStock {
    public static void buySellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int sellPrice = prices[i];
            if (buyPrice < sellPrice) {
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = sellPrice;
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 9, 4 };
        buySellStock(prices);
    }

}
