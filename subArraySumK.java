/*
Subarray Sum Equals K

Given an array of integers arr and an integer k, return the total number of continuous subarrays whose sum equals to k.

Input Format
1st line contains two integers N and K.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print a single integer denoting the count of subarrays whose sum is equal to k.

Example 1
Input
3 2
1 1 1
Output
2
Explanation
The subarrays [1, 1] (index 0 to 1) and [1, 1] (index 1 to 2) have sum equal to 2.

Example 2
Input
3 3
1 2 3
Output
2
Explanation
The subarrays [1, 2] and [3] have sum equal to 3.

Example 3
Input
4 0
1 -1 0 0
Output
6
Explanation
Subarrays with sum 0: [1, -1], [1, -1, 0], [1, -1, 0, 0], [0], [0, 0], [0].

Constraints
1 <= N <= 10^5
-1000 <= arr[i] <= 1000
-10^7 <= k <= 10^7
*/

import java.io.*;
import java.util.*;

class Solution {
    public int subarraySum(int[] arr, int k) {
        int count = 0;
        int currentSum = 0;
        Map<Integer, Integer> prefixSumMap = new HashMap<>();

        // Base case: prefix sum 0 has occurred once
        prefixSumMap.put(0, 1);

        for (int num : arr) {
            currentSum += num;

            // Check if there is a prefix sum that satisfies (currentSum - k)
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}

public class subArraySumK {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.subarraySum(arr, k));
        }
        sc.close();
    }
}
