/*
Coin Change

You are given an integer array coins representing coins of different denominations and an
integer amount representing a total amount of money.

Return the fewest number of coins that you need to make up that amount. If that amount of
money cannot be made up by any combination of the coins, return -1.

You may assume that you have an infinite number of each kind of coin.

Input Format
1st line contains two integers N and amount denoting the number of coin denominations and the target amount.
2nd line contains N space-separated integers denoting the coin values.

Output Format
Print a single integer denoting the minimum coins needed, or -1 if impossible.

Example 1
Input
3 11
1 2 5
Output
3
Explanation
11 = 5 + 5 + 1 (3 coins).

Example 2
Input
1 3
2
Output
-1
Explanation
Amount 3 cannot be formed using only denomination 2.

Example 3
Input
1 0
1
Output
0
Explanation
Amount 0 requires 0 coins.

Constraints
1 <= N <= 12
1 <= coins[i] <= 2^31 - 1
0 <= amount <= 10^4
*/

import java.io.*;
import java.util.*;

public class coinChange {
    static class Solution {
        public int coinChange(int[] coins, int n, int amount) {
            if (amount < 0) return -1;
            if (amount == 0) return 0;

            // dp[i] will store the minimum coins needed to make amount i
            int[] dp = new int[amount + 1];
            // Fill with sentinel value (amount + 1 is effectively infinity)
            Arrays.fill(dp, amount + 1);
            dp[0] = 0;

            for (int i = 1; i <= amount; i++) {
                for (int coin : coins) {
                    if (i >= coin) {
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                    }
                }
            }

            return dp[amount] > amount ? -1 : dp[amount];
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int amount = sc.nextInt();
            int[] coins = new int[n];

            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.coinChange(coins, n, amount));
        }
        sc.close();
    }
}
