/*
Find Minimum in Rotated Sorted Array

Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
For example, the array nums = [0,1,2,4,5,6,7] might become:
[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.

Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting the elements of the rotated sorted array.

Output Format
Print a single integer denoting the minimum element in the array.

Example 1
Input
5
3 4 5 1 2
Output
1
Explanation
The original array was [1, 2, 3, 4, 5] rotated 3 times.

Example 2
Input
7
4 5 6 7 0 1 2
Output
0
Explanation
The original array was [0, 1, 2, 4, 5, 6, 7] and it was rotated 4 times.

Example 3
Input
4
11 13 15 17
Output
11
Explanation
The original array was [11, 13, 15, 17] and it was rotated 4 times.

Constraints
1 <= N <= 10^5
-5000 <= nums[i] <= 5000
All the integers of nums are unique.
nums is sorted and rotated between 1 and N times.
*/

import java.io.*;
import java.util.*;

public class findMinRotated {
    static class Solution {
        public int findMin(int[] nums, int n) {
            int low = 0;
            int high = n - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                // If element at mid is strictly greater than element at high,
                // the inflection point (minimum) must be in the right half (mid + 1 to high).
                if (nums[mid] > nums[high]) {
                    low = mid + 1;
                } else {
                    // nums[mid] <= nums[high]: right half is sorted,
                    // so the minimum could be mid itself or to its left.
                    high = mid;
                }
            }

            return nums[low];
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
            System.out.println(obj.findMin(nums, n));
        }
        sc.close();
    }
}
