/*
Spiral Matrix

Given an M x N matrix, return all elements of the matrix in spiral order (clockwise starting from the top-left corner).

Input Format
1st line contains two integers M and N denoting the number of rows and columns.
Next M lines contain N space-separated integers representing the matrix elements.

Output Format
Print all elements of the matrix in spiral order separated by a single space.

Example 1
Input
3 3
1 2 3
4 5 6
7 8 9
Output
1 2 3 6 9 8 7 4 5
Explanation
Traverse right: 1 -> 2 -> 3
Traverse down: 6 -> 9
Traverse left: 8 -> 7
Traverse up: 4
Traverse right: 5

Example 2
Input
3 4
1 2 3 4
5 6 7 8
9 10 11 12
Output
1 2 3 4 8 12 11 10 9 5 6 7
Explanation
Following the spiral path yields 1 2 3 4 8 12 11 10 9 5 6 7.

Constraints
1 <= M, N <= 1000
-100 <= matrix[i][j] <= 100
*/

import java.io.*;
import java.util.*;

public class spiralMatrix {
    static class Solution {
        public List<Integer> spiralOrder(int[][] matrix, int m, int n) {
            List<Integer> result = new ArrayList<>();
            if (m == 0 || n == 0) return result;

            int top = 0;
            int bottom = m - 1;
            int left = 0;
            int right = n - 1;

            while (top <= bottom && left <= right) {
                // Traverse from left to right along the top boundary
                for (int col = left; col <= right; col++) {
                    result.add(matrix[top][col]);
                }
                top++;

                // Traverse from top to bottom along the right boundary
                for (int row = top; row <= bottom; row++) {
                    result.add(matrix[row][right]);
                }
                right--;

                // Traverse from right to left along the bottom boundary
                if (top <= bottom) {
                    for (int col = right; col >= left; col--) {
                        result.add(matrix[bottom][col]);
                    }
                    bottom--;
                }

                // Traverse from bottom to top along the left boundary
                if (left <= right) {
                    for (int row = bottom; row >= top; row--) {
                        result.add(matrix[row][left]);
                    }
                    left++;
                }
            }

            return result;
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

            Solution obj = new Solution();
            List<Integer> res = obj.spiralOrder(matrix, m, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < res.size(); i++) {
                sb.append(res.get(i));
                if (i < res.size() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
