/*
Minimum Size Subarray Sum

Given an array of positive integers nums and a positive integer target, return the minimal length
of a contiguous subarray [nums[l], nums[l+1], ..., nums[r-1], nums[r]] of which the sum is greater
than or equal to target. If there is no such subarray, return 0 instead.

Input Format
1st line contains two integers N and target.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print a single integer denoting the minimal length of a contiguous subarray whose sum is >= target, or 0 if none exists.

Example 1
Input
6 7
2 3 1 2 4 3
Output
2
Explanation
The subarray [4, 3] has the minimal length (length 2) with sum >= 7.

Example 2
Input
3 4
1 4 4
Output
1
Explanation
The subarray [4] has minimal length 1.

Example 3
Input
5 11
1 1 1 1 1
Output
0
Explanation
The sum of all elements is 5, which is strictly less than 11. Hence no such subarray exists.

Constraints
1 <= N <= 10^5
1 <= nums[i] <= 10^4
1 <= target <= 10^9
*/

import java.io.*;
import java.util.*;

public class minSubArrayLen {
    static class Solution {
        public int minSubArrayLen(int target, int[] nums, int n) {
            int left = 0;
            long currentSum = 0;
            int minLength = Integer.MAX_VALUE;

            for (int right = 0; right < n; right++) {
                currentSum += nums[right];

                // Contract the window from the left as long as the window's sum is >= target
                while (currentSum >= target) {
                    minLength = Math.min(minLength, right - left + 1);
                    currentSum -= nums[left];
                    left++;
                }
            }

            return minLength == Integer.MAX_VALUE ? 0 : minLength;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.minSubArrayLen(target, nums, n));
        }
        sc.close();
    }
}
