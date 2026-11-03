/*
Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
of a given target value.

If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log N) runtime complexity.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the sorted array.
3rd line contains an integer target.

Output Format
Print two space-separated integers representing the first and last index (0-based) of target, or -1 -1.

Example 1
Input
6
5 7 7 8 8 10
8
Output
3 4
Explanation
Target 8 first appears at index 3 and last appears at index 4.

Example 2
Input
6
5 7 7 8 8 10
6
Output
-1 -1
Explanation
Target 6 does not exist in the array.

Example 3
Input
0
0
Output
-1 -1

Constraints
0 <= N <= 10^5
-10^9 <= nums[i] <= 10^9
nums is a non-decreasing array.
-10^9 <= target <= 10^9
*/

import java.io.*;
import java.util.*;

public class searchRange {
    static class Solution {
        public int[] searchRange(int[] nums, int n, int target) {
            int first = findFirst(nums, n, target);
            if (first == -1) {
                return new int[]{-1, -1};
            }
            int last = findLast(nums, n, target);
            return new int[]{first, last};
        }

        private int findFirst(int[] nums, int n, int target) {
            int low = 0;
            int high = n - 1;
            int result = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    result = mid;
                    high = mid - 1; // Narrow search to the left for first occurrence
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return result;
        }

        private int findLast(int[] nums, int n, int target) {
            int low = 0;
            int high = n - 1;
            int result = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    result = mid;
                    low = mid + 1; // Narrow search to the right for last occurrence
                } else if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
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

            if (sc.hasNextInt()) {
                int target = sc.nextInt();
                Solution obj = new Solution();
                int[] ans = obj.searchRange(nums, n, target);
                System.out.println(ans[0] + " " + ans[1]);
            } else {
                System.out.println("-1 -1");
            }
        } else {
            System.out.println("-1 -1");
        }
        sc.close();
    }
}
