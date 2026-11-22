/*
Minimum Cost Climbing Stairs

Each cost[i] is the cost of stepping on stair i. After paying it, you may
climb one or two steps. You may start at stair 0 or stair 1. Find the minimum
cost to reach the top (just beyond the last stair).

Input: N followed by N space-separated costs.
Output: The minimum cost.

Example 1
Input
3
10 15 20
Output
15

Example 2
Input
10
1 100 1 1 1 100 1 1 100 1
Output
6

Constraints: 2 <= N <= 1000, 0 <= cost[i] <= 999.
Time: O(N); auxiliary space: O(1).
*/

import java.util.Scanner;

public class minCostClimbingStairs {
    static int minCost(int[] cost) {
        int twoBack = 0;
        int oneBack = 0;
        for (int step = 2; step <= cost.length; step++) {
            int current = Math.min(oneBack + cost[step - 1],
                                   twoBack + cost[step - 2]);
            twoBack = oneBack;
            oneBack = current;
        }
        return oneBack;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) cost[i] = sc.nextInt();
            System.out.println(minCost(cost));
        }
        sc.close();
    }
}
