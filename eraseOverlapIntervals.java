/*
Non-overlapping Intervals

Given an array of intervals where intervals[i] = [start_i, end_i], return the minimum number
of intervals you need to remove to make the rest of the intervals non-overlapping.

Note: Intervals that touch at a single point (e.g., [1, 2] and [2, 3]) are considered non-overlapping.

Input Format
1st line contains an integer N denoting the number of intervals.
Next N lines contain 2 space-separated integers denoting start and end of each interval.

Output Format
Print a single integer denoting the minimum number of intervals to remove.

Example 1
Input
4
1 2
2 3
3 4
1 3
Output
1
Explanation
Removing [1, 3] leaves [1, 2], [2, 3], [3, 4] non-overlapping.

Example 2
Input
3
1 2
1 2
1 2
Output
2
Explanation
You need to remove two [1, 2] intervals so that the remaining one is non-overlapping.

Example 3
Input
3
1 2
2 3
3 4
Output
0
Explanation
None of the intervals overlap, so 0 removals are needed.

Constraints
1 <= N <= 10^5
-5 * 10^4 <= start_i < end_i <= 5 * 10^4
*/

import java.io.*;
import java.util.*;

public class eraseOverlapIntervals {
    static class Solution {
        public int eraseOverlapIntervals(int[][] intervals, int n) {
            if (n <= 1) return 0;

            // Greedily sort intervals by end time in ascending order
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

            int removals = 0;
            int prevEnd = intervals[0][1];

            for (int i = 1; i < n; i++) {
                // If current interval starts before the previous one ends, overlap occurs
                if (intervals[i][0] < prevEnd) {
                    removals++; // Greedily drop the current interval with larger end time
                } else {
                    prevEnd = intervals[i][1]; // Accept interval and update end bound
                }
            }

            return removals;
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
            System.out.println(obj.eraseOverlapIntervals(intervals, n));
        }
        sc.close();
    }
}
