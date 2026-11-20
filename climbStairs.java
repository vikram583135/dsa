/*
Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Input Format
A single line containing an integer N denoting the number of steps.

Output Format
Print a single integer denoting the number of distinct ways to climb to the top.

Example 1
Input
2
Output
2
Explanation
There are two ways to climb to the top:
1. 1 step + 1 step
2. 2 steps

Example 2
Input
3
Output
3
Explanation
There are three ways to climb to the top:
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Example 3
Input
5
Output
8
Explanation
The Fibonacci-style transitions yield: 1, 2, 3, 5, 8 ways.

Constraints
1 <= N <= 45
*/

import java.io.*;
import java.util.*;

public class climbStairs {
    static class Solution {
        public int climbStairs(int n) {
            if (n <= 2) return n;

            // Space-optimized 1D DP using two running variables
            int prev2 = 1; // ways to reach step 1
            int prev1 = 2; // ways to reach step 2

            for (int i = 3; i <= n; i++) {
                int curr = prev1 + prev2;
                prev2 = prev1;
                prev1 = curr;
            }

            return prev1;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.climbStairs(n));
        }
        sc.close();
    }
}
