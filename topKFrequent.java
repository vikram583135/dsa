/*
Top K Frequent Elements

Given an integer array nums of size N and an integer K, return the K most frequent elements.
You may return the answer in any order.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.
3rd line contains an integer K.

Output Format
Print K space-separated integers representing the K most frequent elements.

Example 1
Input
6
1 1 1 2 2 3
2
Output
1 2
Explanation
1 appears 3 times, 2 appears 2 times, and 3 appears 1 time. The top 2 frequent elements are 1 and 2.

Example 2
Input
1
1
1
Output
1

Constraints
1 <= N <= 10^5
-10^4 <= nums[i] <= 10^4
K is in the range [1, number of unique elements in the array].
It is guaranteed that the answer is unique.
*/

import java.io.*;
import java.util.*;

public class topKFrequent {
    static class Solution {
        @SuppressWarnings("unchecked")
        public int[] topKFrequent(int[] nums, int n, int k) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            // Bucket sort by frequency: index = frequency (1..n)
            List<Integer>[] buckets = new List[n + 1];
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int count = entry.getValue();
                if (buckets[count] == null) {
                    buckets[count] = new ArrayList<>();
                }
                buckets[count].add(entry.getKey());
            }

            int[] result = new int[k];
            int idx = 0;

            // Collect top k elements from highest frequency bucket downward
            for (int count = n; count >= 1 && idx < k; count--) {
                if (buckets[count] != null) {
                    for (int num : buckets[count]) {
                        result[idx++] = num;
                        if (idx == k) break;
                    }
                }
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
            int k = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.topKFrequent(nums, n, k);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < res.length; i++) {
                if (i > 0) sb.append(" ");
                sb.append(res[i]);
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
