/*
Trapping Rain Water

Given N non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting the elevation heights.

Output Format
Print a single integer denoting the total amount of water trapped.

Example 1
Input
12
0 1 0 2 1 0 1 3 2 1 2 1
Output
6
Explanation
The elevation map is represented by array [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]. In this case, 6 units of rain water are trapped.

Example 2
Input
6
4 2 0 3 2 5
Output
9
Explanation
The elevation map is [4, 2, 0, 3, 2, 5]. In this case, 9 units of rain water are trapped.

Constraints
1 <= N <= 10^5
0 <= height[i] <= 10^5
*/

import java.io.*;
import java.util.*;

class Solution {
    public long trap(int[] height, int n) {
        if (n <= 2) return 0;

        int left = 0;
        int right = n - 1;
        long leftMax = 0;
        long rightMax = 0;
        long totalWater = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater += (leftMax - height[left]);
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater += (rightMax - height[right]);
                }
                right--;
            }
        }

        return totalWater;
    }
}

public class trappingRainWater {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] height = new int[n];
            for (int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.trap(height, n));
        }
        sc.close();
    }
}
