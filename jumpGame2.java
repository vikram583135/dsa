/*
Jump Game II

You are given a 0-indexed array of integers nums of length N. You are initially positioned at nums[0].
Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
- 0 <= j <= nums[i] and
- i + j < N

Return the minimum number of jumps to reach nums[N - 1]. The test cases are generated such that you can reach nums[N - 1].

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print a single integer denoting the minimum number of jumps to reach the last index.

Example 1
Input
5
2 3 1 1 4
Output
2
Explanation
The minimum number of jumps to reach the last index is 2.
Jump 1 step from index 0 to 1, then 3 steps to the last index (index 4).

Example 2
Input
5
2 3 0 1 4
Output
2
Explanation
Jump to index 1 (value 3), then jump 3 steps to the last index.

Example 3
Input
1
0
Output
0
Explanation
Already at the destination index.

Constraints
1 <= N <= 10^5
0 <= nums[i] <= 1000
It's guaranteed that you can reach nums[N - 1].
*/

import java.io.*;
import java.util.*;

public class jumpGame2 {
    static class Solution {
        public int jump(int[] nums, int n) {
            if (n <= 1) return 0;

            int jumps = 0;
            int currentEnd = 0;
            int farthest = 0;

            // Loop until n - 1 because reaching the last index finishes the task
            for (int i = 0; i < n - 1; i++) {
                farthest = Math.max(farthest, i + nums[i]);

                // When we reach the boundary of the current jump level
                if (i == currentEnd) {
                    jumps++;
                    currentEnd = farthest;

                    // If we can already reach or exceed the last index, terminate early
                    if (currentEnd >= n - 1) {
                        break;
                    }
                }
            }

            return jumps;
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
            System.out.println(obj.jump(nums, n));
        }
        sc.close();
    }
}
