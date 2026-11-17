/*
Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order (printed here in ascending index order).

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.
3rd line contains an integer target.

Output Format
Print two space-separated integers denoting the 0-based indices of the two numbers.

Example 1
Input
4
2 7 11 15
9
Output
0 1
Explanation
Because nums[0] + nums[1] == 9, we return 0 1.

Example 2
Input
3
3 2 4
6
Output
1 2
Explanation
Because nums[1] + nums[2] == 6, we return 1 2.

Example 3
Input
2
3 3
6
Output
0 1

Constraints
2 <= N <= 10^5
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.
*/

import java.io.*;
import java.util.*;

public class twoSum {
    static class Solution {
        public int[] twoSum(int[] nums, int n, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int complement = target - nums[i];

                // Check if the complement exists in the map
                if (map.containsKey(complement)) {
                    int prevIndex = map.get(complement);
                    return new int[]{Math.min(prevIndex, i), Math.max(prevIndex, i)};
                }

                map.put(nums[i], i);
            }

            return new int[]{-1, -1};
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

            int target = sc.nextInt();

            Solution obj = new Solution();
            int[] result = obj.twoSum(nums, n, target);
            System.out.println(result[0] + " " + result[1]);
        }
        sc.close();
    }
}
