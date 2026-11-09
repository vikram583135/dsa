/*
House Robber

You are a professional robber planning to rob houses along a street. Each house has a certain
amount of money stashed, the only constraint stopping you from robbing each of them is that
adjacent houses have security systems connected and it will automatically contact the police
if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum
amount of money you can rob tonight without alerting the police.

Input Format
1st line contains an integer N denoting the number of houses.
2nd line contains N space-separated integers denoting money in each house.

Output Format
Print a single integer denoting the maximum amount of money you can rob without alerting police.

Example 1
Input
4
1 2 3 1
Output
4
Explanation
Rob house 1 (money = 1) and then rob house 3 (money = 3). Total = 1 + 3 = 4.

Example 2
Input
5
2 7 9 3 1
Output
12
Explanation
Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1). Total = 2 + 9 + 1 = 12.

Example 3
Input
1
5
Output
5

Constraints
1 <= N <= 10^5
0 <= nums[i] <= 10^4
*/

import java.io.*;
import java.util.*;

public class houseRobber {
    static class Solution {
        public long rob(int[] nums, int n) {
            if (n == 0) return 0;
            if (n == 1) return nums[0];

            long prev2 = 0; // Max money robbed up to i - 2
            long prev1 = 0; // Max money robbed up to i - 1

            for (int i = 0; i < n; i++) {
                long current = Math.max(prev1, prev2 + nums[i]);
                prev2 = prev1;
                prev1 = current;
            }

            return prev1;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.rob(nums, n));
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
