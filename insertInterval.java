/*
Insert Interval

You are given an array of non-overlapping intervals where intervals[i] = [start_i, end_i]
sorted in ascending order by start_i. You are also given an interval newInterval = [start, end]
that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by start_i
and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Input Format
1st line contains an integer N denoting the number of intervals.
Next N lines contain 2 space-separated integers denoting start and end of each interval.
The last line contains 2 space-separated integers denoting start and end of newInterval.

Output Format
Print each interval on a new line with start and end separated by a single space.

Example 1
Input
2
1 3
6 9
2 5
Output
1 5
6 9
Explanation
Because the new interval [2, 5] overlaps with [1, 3], they are merged into [1, 5].

Example 2
Input
5
1 2
3 5
6 7
8 10
12 16
4 8
Output
1 2
3 10
12 16
Explanation
Because the new interval [4, 8] overlaps with [3, 5], [6, 7], and [8, 10], they are merged into [3, 10].

Example 3
Input
0
5 7
Output
5 7

Constraints
0 <= N <= 10^5
0 <= start_i <= end_i <= 10^5
intervals is sorted by start_i in ascending order.
0 <= newInterval[0] <= newInterval[1] <= 10^5
*/

import java.io.*;
import java.util.*;

public class insertInterval {
    static class Solution {
        public int[][] insert(int[][] intervals, int n, int[] newInterval) {
            List<int[]> result = new ArrayList<>();
            int i = 0;

            // Step 1: Add all intervals that end before newInterval starts
            while (i < n && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }

            // Step 2: Merge all overlapping intervals with newInterval
            while (i < n && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }
            result.add(newInterval);

            // Step 3: Add all remaining intervals that start after newInterval ends
            while (i < n) {
                result.add(intervals[i]);
                i++;
            }

            return result.toArray(new int[result.size()][]);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] intervals = new int[n][2];
            for (int i = 0; i < n; i++) {
                intervals[i][0] = sc.nextInt();
                intervals[i][1] = sc.nextInt();
            }

            int[] newInterval = new int[2];
            newInterval[0] = sc.nextInt();
            newInterval[1] = sc.nextInt();

            Solution obj = new Solution();
            int[][] ans = obj.insert(intervals, n, newInterval);

            StringBuilder sb = new StringBuilder();
            for (int[] interval : ans) {
                sb.append(interval[0]).append(" ").append(interval[1]).append("\n");
            }
            System.out.print(sb.toString());
        }
        sc.close();
    }
}
