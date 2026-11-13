/*
Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the i-th day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a
different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Input Format
1st line contains an integer N denoting the number of days.
2nd line contains N space-separated integers denoting the stock prices on each day.

Output Format
Print a single integer denoting the maximum achievable profit.

Example 1
Input
6
7 1 5 3 6 4
Output
5
Explanation
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2
Input
5
7 6 4 3 1
Output
0
Explanation
In this case, no transactions are done and the max profit = 0.

Constraints
1 <= N <= 10^5
0 <= prices[i] <= 10^4
*/

import java.io.*;
import java.util.*;

public class maxProfit {
    static class Solution {
        public int maxProfit(int[] prices, int n) {
            if (n <= 1) return 0;

            int minPrice = prices[0];
            int maxProfit = 0;

            for (int i = 1; i < n; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else {
                    int profit = prices[i] - minPrice;
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }

            return maxProfit;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] prices = new int[n];
            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.maxProfit(prices, n));
        }
        sc.close();
    }
}
