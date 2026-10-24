/*
3Sum (Three Sum)

Given an integer array nums of size N, find all unique triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print each unique triplet on a new line with elements sorted and space-separated.
The triplets should be printed in lexicographical order.

Example 1
Input
6
-1 0 1 2 -1 -4
Output
-1 -1 2
-1 0 1
Explanation
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1, -1, 2] and [-1, 0, 1].

Example 2
Input
3
0 1 1
Output

Explanation
The only possible triplet does not sum up to 0.

Example 3
Input
3
0 0 0
Output
0 0 0
Explanation
The only possible triplet sums up to 0.

Constraints
3 <= N <= 3000
-10^5 <= nums[i] <= 10^5
*/

import java.io.*;
import java.util.*;

public class threeSum {
    static class Solution {
        public List<List<Integer>> findTriplets(int[] nums, int n) {
            List<List<Integer>> result = new ArrayList<>();
            if (n < 3) return result;

            // Sort the array to easily navigate using two pointers and skip duplicates
            Arrays.sort(nums);

            for (int i = 0; i < n - 2; i++) {
                // If the smallest number is greater than 0, no three numbers can sum to 0
                if (nums[i] > 0) break;

                // Skip duplicate elements for the first position
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int left = i + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicate elements for left pointer
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicate elements for right pointer
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
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

            Solution obj = new Solution();
            List<List<Integer>> triplets = obj.findTriplets(nums, n);

            StringBuilder sb = new StringBuilder();
            for (List<Integer> triplet : triplets) {
                sb.append(triplet.get(0)).append(" ")
                  .append(triplet.get(1)).append(" ")
                  .append(triplet.get(2)).append("\n");
            }
            System.out.print(sb.toString());
        }
        sc.close();
    }
}
