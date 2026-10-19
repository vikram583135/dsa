/*
Container With Most Water

You are given an integer array height of length N representing the heights of N vertical lines.
Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting the heights of the vertical lines.

Output Format
Print a single integer denoting the maximum amount of water a container can store.

Example 1
Input
9
1 8 6 2 5 4 8 3 7
Output
49
Explanation
The vertical lines are represented by array [1, 8, 6, 2, 5, 4, 8, 3, 7].
The max area of water the container can contain is between index 1 (height 8) and index 8 (height 7):
min(8, 7) * (8 - 1) = 7 * 7 = 49.

Example 2
Input
2
1 1
Output
1
Explanation
The vertical lines are represented by array [1, 1].
The container can store min(1, 1) * (1 - 0) = 1 * 1 = 1 unit of water.

Constraints
2 <= N <= 10^5
0 <= height[i] <= 10^4
*/

import java.io.*;
import java.util.*;

public class containerWithMostWater {
    static class Solution {
        public long maxArea(int[] height, int n) {
            if (n < 2) return 0;

            int left = 0;
            int right = n - 1;
            long maxWater = 0;

            while (left < right) {
                long currentWater = (long) Math.min(height[left], height[right]) * (right - left);
                maxWater = Math.max(maxWater, currentWater);

                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }

            return maxWater;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.maxArea(height, n));
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
