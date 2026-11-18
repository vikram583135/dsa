/*
Unique Paths

There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 10^9.

Input Format
A single line containing two space-separated integers M and N.

Output Format
Print a single integer denoting the number of unique paths.

Example 1
Input
3 7
Output
28
Explanation
A 3 x 7 grid has 28 unique paths from top-left to bottom-right.

Example 2
Input
3 2
Output
3
Explanation
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

Example 3
Input
1 1
Output
1

Constraints
1 <= m, n <= 100
*/

import java.io.*;
import java.util.*;

public class uniquePaths {
    static class Solution {
        public int uniquePaths(int m, int n) {
            if (m <= 0 || n <= 0) return 0;
            if (m == 1 || n == 1) return 1;

            // Use rolling 1D DP array of size n (or min(m, n)) to optimize space to O(N)
            int[] dp = new int[n];
            Arrays.fill(dp, 1);

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    // Ways to reach (i, j) = ways from top dp[j] + ways from left dp[j-1]
                    dp[j] += dp[j - 1];
                }
            }

            return dp[n - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                Solution obj = new Solution();
                System.out.println(obj.uniquePaths(m, n));
            }
        }
        sc.close();
    }
}
