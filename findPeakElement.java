/*
Find Peak Element

A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array nums, find a peak element, and return its index.
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -infinity. In other words, an element is always
considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log N) time.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print a single integer denoting the 0-based index of any peak element.

Example 1
Input
4
1 2 3 1
Output
2
Explanation
3 is a peak element and its 0-based index is 2.

Example 2
Input
7
1 2 1 3 5 6 4
Output
5
Explanation
Your function can return either index number 1 (where the peak element is 2), or index number 5 (where the peak element is 6).

Constraints
1 <= N <= 10^5
-2^31 <= nums[i] <= 2^31 - 1
nums[i] != nums[i + 1] for all valid i.
*/

import java.io.*;
import java.util.*;

public class findPeakElement {
    static class Solution {
        public int findPeak(int[] nums, int n) {
            int low = 0;
            int high = n - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                // Compare mid element with its right neighbor
                if (nums[mid] > nums[mid + 1]) {
                    // Downward slope: a peak exists at mid or to its left
                    high = mid;
                } else {
                    // Upward slope: a peak must exist to the right of mid
                    low = mid + 1;
                }
            }

            return low;
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
            System.out.println(obj.findPeak(nums, n));
        }
        sc.close();
    }
}
