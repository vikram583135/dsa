/*
Merge Overlapping Intervals

Given an array of intervals where intervals[i] = [start_i, end_i], merge all overlapping intervals,
and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input Format
1st line contains an integer N denoting the number of intervals.
Next N lines contain 2 space-separated integers denoting start and end of each interval.

Output Format
Print each merged interval on a new line with start and end separated by a space.

Example 1
Input
4
1 3
2 6
8 10
15 18
Output
1 6
8 10
15 18
Explanation
Intervals [1, 3] and [2, 6] overlap, so they are merged into [1, 6].

Example 2
Input
2
1 4
4 5
Output
1 5
Explanation
Intervals [1, 4] and [4, 5] overlap at 4, so they are merged into [1, 5].

Constraints
1 <= N <= 10^5
0 <= start_i <= end_i <= 10^5
*/

import java.io.*;
import java.util.*;

public class mergeIntervals {
    static class Solution {
        public int[][] merge(int[][] intervals, int n) {
            if (n <= 1) return intervals;

            // Sort intervals based on starting time
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

            List<int[]> merged = new ArrayList<>();
            int[] current = intervals[0];
            merged.add(current);

            for (int i = 1; i < n; i++) {
                int currentEnd = current[1];
                int nextStart = intervals[i][0];
                int nextEnd = intervals[i][1];

                if (currentEnd >= nextStart) {
                    // Overlapping intervals, update the end time
                    current[1] = Math.max(currentEnd, nextEnd);
                } else {
                    // Disjoint interval, add to list and update current reference
                    current = intervals[i];
                    merged.add(current);
                }
            }

            return merged.toArray(new int[merged.size()][]);
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

            Solution obj = new Solution();
            int[][] result = obj.merge(intervals, n);

            for (int[] interval : result) {
                System.out.println(interval[0] + " " + interval[1]);
            }
        }
        sc.close();
    }
}
