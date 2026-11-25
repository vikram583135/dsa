/*
Maximum Product Subarray

Given an integer array nums of size N, find a contiguous non-empty subarray within the array
that has the largest product, and print the product.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print a single integer denoting the maximum product of a contiguous subarray.

Example 1
Input
4
2 3 -2 4
Output
6
Explanation
[2, 3] has the largest product 6.

Example 2
Input
3
-2 0 -1
Output
0
Explanation
The result cannot be 2, because [-2, -1] is not a subarray.

Example 3
Input
3
-2 3 -4
Output
24
Explanation
The entire array [-2, 3, -4] has product (-2) * 3 * (-4) = 24.

Constraints
1 <= N <= 2 * 10^4
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/

import java.io.*;
import java.util.*;

public class maxProductSubArray {
    static class Solution {
        public int maxProduct(int[] nums, int n) {
            if (n == 0) return 0;

            int currMax = nums[0];
            int currMin = nums[0];
            int maxProd = nums[0];

            for (int i = 1; i < n; i++) {
                int num = nums[i];

                // Multiplying by a negative number swaps the roles of max and min
                if (num < 0) {
                    int temp = currMax;
                    currMax = currMin;
                    currMin = temp;
                }

                currMax = Math.max(num, currMax * num);
                currMin = Math.min(num, currMin * num);

                maxProd = Math.max(maxProd, currMax);
            }

            return maxProd;
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
            System.out.println(obj.maxProduct(nums, n));
        }
        sc.close();
    }
}
