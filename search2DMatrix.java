/*
Search a 2D Matrix

You are given an M x N integer matrix with the following two properties:
1. Each row is sorted in non-decreasing order.
2. The first integer of each row is greater than the last integer of the previous row.

Given an integer target, return true if target is in matrix or false otherwise.
You must write a solution in O(log(M * N)) time complexity.

Input Format
1st line contains two integers M and N denoting the number of rows and columns.
Next M lines contain N space-separated integers representing the matrix rows.
The last line contains an integer target.

Output Format
Print true if the target is found in the matrix, otherwise false.

Example 1
Input
3 4
1 3 5 7
10 11 16 20
23 30 34 60
3
Output
true
Explanation
The value 3 exists at row 0, column 1 of the matrix.

Example 2
Input
3 4
1 3 5 7
10 11 16 20
23 30 34 60
13
Output
false
Explanation
The value 13 does not exist in the matrix.

Constraints
1 <= M, N <= 1000
-10^4 <= matrix[i][j], target <= 10^4
*/

import java.io.*;
import java.util.*;

public class search2DMatrix {
    static class Solution {
        public boolean searchMatrix(int[][] matrix, int m, int n, int target) {
            if (m == 0 || n == 0) return false;

            // Treat the 2D matrix as a virtual 1D sorted array of length m * n
            int low = 0;
            int high = m * n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                int row = mid / n;
                int col = mid % n;
                int midVal = matrix[row][col];

                if (midVal == target) {
                    return true;
                } else if (midVal < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] matrix = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int target = sc.nextInt();

            Solution obj = new Solution();
            System.out.println(obj.searchMatrix(matrix, m, n, target));
        }
        sc.close();
    }
}
