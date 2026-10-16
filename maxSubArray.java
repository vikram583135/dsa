/*
Maximum Subarray Sum (Kadane's Algorithm)

Given an array of N integers, find the contiguous subarray (containing at least one number) which has the largest sum and print its sum.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting the elements of the array.

Output Format
Print a single integer - the maximum subarray sum.

Example 1
Input
9
-2 1 -3 4 -1 2 1 -5 4
Output
6
Explanation
The contiguous subarray [4, -1, 2, 1] has the largest sum = 6.

Example 2
Input
5
5 4 -1 7 8
Output
23
Explanation
The contiguous subarray [5, 4, -1, 7, 8] has the largest sum = 23.

Example 3
Input
3
-3 -2 -1
Output
-1
Explanation
The single element subarray [-1] has the largest sum = -1.

Constraints
1 <= N <= 10^5
-10^4 <= arr[i] <= 10^4
*/

import java.io.*;
import java.util.*;

class Solution {
    public long maxSubarraySum(int[] arr, int n) {
        if (n == 0) return 0;

        long maxSoFar = arr[0];
        long currentMax = arr[0];

        for (int i = 1; i < n; i++) {
            // Either add current element to existing subarray or start fresh from current element
            currentMax = Math.max((long) arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}

public class maxSubArray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.maxSubarraySum(arr, n));
        }
        sc.close();
    }
}
