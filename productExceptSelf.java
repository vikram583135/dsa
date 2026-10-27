/*
Product of Array Except Self

Given an integer array nums of length N, return an array answer such that answer[i] is equal
to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(N) time and without using the division operation.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print N space-separated integers representing the resulting array.

Example 1
Input
4
1 2 3 4
Output
24 12 8 6
Explanation
- answer[0] = 2 * 3 * 4 = 24
- answer[1] = 1 * 3 * 4 = 12
- answer[2] = 1 * 2 * 4 = 8
- answer[3] = 1 * 2 * 3 = 6

Example 2
Input
5
-1 1 0 -3 3
Output
0 0 9 0 0

Constraints
2 <= N <= 10^5
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/

import java.io.*;
import java.util.*;

public class productExceptSelf {
    static class Solution {
        public int[] productExceptSelf(int[] nums, int n) {
            int[] result = new int[n];

            // Step 1: Compute prefix products directly into result array
            // result[i] will contain the product of all elements to the left of i
            result[0] = 1;
            for (int i = 1; i < n; i++) {
                result[i] = result[i - 1] * nums[i - 1];
            }

            // Step 2: Traverse from right to left, maintaining running suffix product
            int suffix = 1;
            for (int i = n - 1; i >= 0; i--) {
                result[i] = result[i] * suffix;
                suffix *= nums[i];
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
            int[] ans = obj.productExceptSelf(nums, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(ans[i]);
                if (i < n - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
