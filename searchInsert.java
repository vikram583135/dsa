/*
Search Insert Position

Given a sorted array of distinct integers and a target, return the index of
the target, or the index where it should be inserted to preserve order.

Input Format
First line: N, the number of elements.
Second line: N space-separated integers in strictly increasing order.
Third line: target integer.

Output Format
Print the zero-based index.

Example 1
Input
4
1 3 5 6
5
Output
2

Example 2
Input
4
1 3 5 6
2
Output
1

Example 3
Input
4
1 3 5 6
7
Output
4

Constraints
0 <= N <= 100000
-1000000000 <= array elements and target <= 1000000000
Time: O(log N); auxiliary space: O(1).
*/

import java.util.Scanner;

public class searchInsert {
    static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
            int target = sc.nextInt();
            System.out.println(searchInsert(nums, target));
        }
        sc.close();
    }
}
