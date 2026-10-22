/*
Rotate Matrix by 90 Degrees Clockwise

You are given an N x N 2D matrix representing an image.
Rotate the image by 90 degrees in a clockwise direction.
The rotation must be done in-place, meaning you have to modify the 2D matrix directly without allocating another 2D matrix.

Input Format
1st line contains an integer N representing the number of rows and columns of the matrix.
Next N lines contain N space-separated integers representing the matrix elements.

Output Format
Print the rotated N x N matrix, each row on a new line with elements separated by a space.

Example 1
Input
3
1 2 3
4 5 6
7 8 9
Output
7 4 1
8 5 2
9 6 3
Explanation
Rotating the matrix 90 degrees clockwise produces:
7 4 1
8 5 2
9 6 3

Example 2
Input
4
5 1 9 11
2 4 8 10
13 3 6 7
15 14 12 16
Output
15 13 2 5
14 3 4 1
12 6 8 9
16 7 10 11
Explanation
Rotating the 4x4 matrix 90 degrees clockwise gives the desired output.

Constraints
1 <= N <= 1000
-10^4 <= matrix[i][j] <= 10^4
*/

import java.io.*;
import java.util.*;

public class rotateMatrix {
    static class Solution {
        public void rotate(int[][] matrix, int n) {
            // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Step 2: Reverse each row of the transposed matrix
            for (int i = 0; i < n; i++) {
                int left = 0;
                int right = n - 1;
                while (left < right) {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            Solution obj = new Solution();
            obj.rotate(matrix, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
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
