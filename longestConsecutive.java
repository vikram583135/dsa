/*
Longest Consecutive Sequence

Given an unsorted array of integers arr, find the length of the longest consecutive elements sequence.
The algorithm should run in O(N) time complexity.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print a single integer - the length of the longest consecutive sequence.

Example 1
Input
6
100 4 200 1 3 2
Output
4
Explanation
The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2
Input
10
0 3 7 2 5 8 4 6 0 1
Output
9
Explanation
The longest consecutive elements sequence is [0, 1, 2, 3, 4, 5, 6, 7, 8]. Therefore its length is 9.

Constraints
0 <= N <= 10^5
-10^9 <= arr[i] <= 10^9
*/

import java.io.*;
import java.util.*;

public class longestConsecutive {
    static class Solution {
        public int longestConsecutive(int[] arr, int n) {
            if (n == 0) return 0;

            Set<Integer> numSet = new HashSet<>();
            for (int num : arr) {
                numSet.add(num);
            }

            int longestStreak = 0;

            for (int num : numSet) {
                // Check if 'num' is the start of a consecutive sequence
                if (!numSet.contains(num - 1)) {
                    int currentNum = num;
                    int currentStreak = 1;

                    while (numSet.contains(currentNum + 1)) {
                        currentNum++;
                        currentStreak++;
                    }

                    longestStreak = Math.max(longestStreak, currentStreak);
                }
            }

            return longestStreak;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.longestConsecutive(arr, n));
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
