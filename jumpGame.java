/*
Jump Game

You are given an integer array nums of length N. You are initially positioned at the array's
first index (index 0), and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index (index N - 1), or false otherwise.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print true if you can reach the last index, otherwise false.

Example 1
Input
5
2 3 1 1 4
Output
true
Explanation
Jump 1 step from index 0 to 1, then 3 steps to the last index (index 4).

Example 2
Input
5
3 2 1 0 4
Output
false
Explanation
You will always arrive at index 3 no matter what. Its maximum jump length is 0,
which makes it impossible to reach the last index.

Constraints
1 <= N <= 10^5
0 <= nums[i] <= 10^5
*/

import java.io.*;
import java.util.*;

public class jumpGame {
    static class Solution {
        public boolean canJump(int[] nums, int n) {
            int maxReach = 0;

            for (int i = 0; i < n; i++) {
                // If current index is beyond the maximum reach achieved so far, we cannot proceed
                if (i > maxReach) {
                    return false;
                }

                // Update the farthest index we can reach
                maxReach = Math.max(maxReach, i + nums[i]);

                // Early exit: if we can already reach or exceed the last index
                if (maxReach >= n - 1) {
                    return true;
                }
            }

            return true;
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
            System.out.println(obj.canJump(nums, n));
        }
        sc.close();
    }
}
