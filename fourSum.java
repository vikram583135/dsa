/*
4Sum

Given an array nums of N integers and an integer target, return an array of all the unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that:
- 0 <= a, b, c, d < N
- a, b, c, and d are distinct.
- nums[a] + nums[b] + nums[c] + nums[d] == target

You must ensure that the output does not contain duplicate quadruplets.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.
3rd line contains an integer target.

Output Format
Print each unique quadruplet on a new line with elements sorted and space-separated.

Example 1
Input
6
1 0 -1 0 -2 2
0
Output
-2 -1 1 2
-2 0 0 2
-1 0 0 1
Explanation
The distinct quadruplets that sum up to 0 are [-2, -1, 1, 2], [-2, 0, 0, 2], and [-1, 0, 0, 1].

Example 2
Input
5
2 2 2 2 2
8
Output
2 2 2 2
Explanation
The only distinct quadruplet that sums to 8 is [2, 2, 2, 2].

Constraints
1 <= N <= 200
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
*/

import java.io.*;
import java.util.*;

public class fourSum {
    static class Solution {
        public List<List<Integer>> fourSum(int[] nums, int n, long target) {
            List<List<Integer>> result = new ArrayList<>();
            if (n < 4) return result;

            // Sort array to use two-pointer technique and skip duplicates easily
            Arrays.sort(nums);

            for (int i = 0; i < n - 3; i++) {
                // Skip duplicates for the first element
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                for (int j = i + 1; j < n - 2; j++) {
                    // Skip duplicates for the second element
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                    int left = j + 1;
                    int right = n - 1;

                    while (left < right) {
                        // Use long to prevent 32-bit integer overflow
                        long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                        if (sum == target) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                            // Skip duplicates for third element
                            while (left < right && nums[left] == nums[left + 1]) {
                                left++;
                            }
                            // Skip duplicates for fourth element
                            while (left < right && nums[right] == nums[right - 1]) {
                                right--;
                            }

                            left++;
                            right--;
                        } else if (sum < target) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
            }

            return result;
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

            long target = sc.nextLong();

            Solution obj = new Solution();
            List<List<Integer>> ans = obj.fourSum(nums, n, target);

            StringBuilder sb = new StringBuilder();
            for (List<Integer> quad : ans) {
                sb.append(quad.get(0)).append(" ")
                  .append(quad.get(1)).append(" ")
                  .append(quad.get(2)).append(" ")
                  .append(quad.get(3)).append("\n");
            }
            System.out.print(sb.toString());
        }
        sc.close();
    }
}
