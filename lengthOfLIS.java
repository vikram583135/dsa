/*
Longest Increasing Subsequence

Given an integer array nums of size N, return the length of the longest strictly increasing subsequence.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print a single integer denoting the length of the longest strictly increasing subsequence.

Example 1
Input
8
10 9 2 5 3 7 101 18
Output
4
Explanation
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4.

Example 2
Input
6
0 1 0 3 2 3
Output
4
Explanation
The longest increasing subsequence is [0, 1, 2, 3], therefore the length is 4.

Example 3
Input
7
7 7 7 7 7 7 7
Output
1
Explanation
All elements are equal, so the longest strictly increasing subsequence has length 1.

Constraints
1 <= N <= 2500
-10^4 <= nums[i] <= 10^4
*/

import java.io.*;
import java.util.*;

public class lengthOfLIS {
    static class Solution {
        public int lengthOfLIS(int[] nums, int n) {
            if (n == 0) return 0;

            // tails[k] stores the smallest tail of all increasing subsequences of length k + 1
            int[] tails = new int[n];
            int size = 0;

            for (int num : nums) {
                int low = 0, high = size;

                // Binary search for the first element >= num (lower bound)
                while (low < high) {
                    int mid = low + (high - low) / 2;
                    if (tails[mid] < num) {
                        low = mid + 1;
                    } else {
                        high = mid;
                    }
                }

                tails[low] = num;
                if (low == size) {
                    size++;
                }
            }

            return size;
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
            System.out.println(obj.lengthOfLIS(nums, n));
        }
        sc.close();
    }
}
