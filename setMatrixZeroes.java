/*
Set Matrix Zeroes

Given an M x N integer matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place without using additional matrix memory (O(1) extra space).

Input Format
1st line contains two integers M and N denoting the number of rows and columns.
Next M lines contain N space-separated integers representing the matrix elements.

Output Format
Print the modified M x N matrix, each row on a new line with elements separated by a space.

Example 1
Input
3 3
1 1 1
1 0 1
1 1 1
Output
1 0 1
0 0 0
1 0 1
Explanation
Element at (1, 1) is 0, so row 1 and column 1 are both set to 0.

Example 2
Input
3 4
0 1 2 0
3 4 5 2
1 3 1 5
Output
0 0 0 0
0 4 5 0
0 3 1 0
Explanation
Elements at (0, 0) and (0, 3) are 0, so row 0, column 0, and column 3 are set to 0.

Constraints
1 <= M, N <= 1000
-2^31 <= matrix[i][j] <= 2^31 - 1
*/

import java.io.*;
import java.util.*;

public class setMatrixZeroes {
    static class Solution {
        public void setZeroes(int[][] matrix, int m, int n) {
            boolean firstRowZero = false;
            boolean firstColZero = false;

            // Check if first row has any zero
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }

            // Check if first column has any zero
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }

            // Use first row and first column as markers
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            // Set inner elements to zero based on markers
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Zero out first row if needed
            if (firstRowZero) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }

            // Zero out first column if needed
            if (firstColZero) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
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
            obj.setZeroes(matrix, m, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sb.append(matrix[i][j]);
                    if (j < n - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
        }
        sc.close();
    }
}

