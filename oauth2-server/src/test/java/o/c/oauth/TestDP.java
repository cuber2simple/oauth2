package o.c.oauth;

import java.util.Arrays;

public class TestDP {
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        //先令 dp[] 初始化为 amount + 1
        Arrays.fill(dp, max);
        //当 amount = 0 时，解也是 0
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                    System.out.println(dp[i]);
                }
            }
        }
        //如果 dp[amount] > amount，即还是初始化的值，说明无解
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1,3,5};
        coinChange(coins, 9);
    }
}
