/*
Search in Rotated Sorted Array

There is an integer array nums sorted in ascending order (with all unique values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target,
return the 0-based index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log N) runtime complexity.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the rotated sorted array.
3rd line contains an integer target.

Output Format
Print a single integer denoting the index of the target (0-based) or -1 if not found.

Example 1
Input
7
4 5 6 7 0 1 2
0
Output
4
Explanation
The value 0 is located at index 4 in the array.

Example 2
Input
7
4 5 6 7 0 1 2
3
Output
-1
Explanation
The value 3 does not exist in the array.

Example 3
Input
1
1
0
Output
-1

Constraints
1 <= N <= 10^5
-10^4 <= nums[i] <= 10^4
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-10^4 <= target <= 10^4
*/

import java.io.*;
import java.util.*;

public class searchRotatedSortedArray {
    static class Solution {
        public int search(int[] nums, int n, int target) {
            int low = 0;
            int high = n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                // Check if the left half is sorted
                if (nums[low] <= nums[mid]) {
                    // Check if target lies within the sorted left half
                    if (nums[low] <= target && target < nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    // Otherwise, the right half must be sorted
                    // Check if target lies within the sorted right half
                    if (nums[mid] < target && target <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }

            return -1;
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
            System.out.println(obj.search(nums, n, target));
        }
        sc.close();
    }
}
