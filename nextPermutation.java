/*
Next Permutation

A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
The next permutation of an array of integers is the next lexicographically greater permutation of its integers.
If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

The replacement must be in place and use only constant extra memory.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting elements of the array.

Output Format
Print the array elements representing the next permutation separated by a single space.

Example 1
Input
3
1 2 3
Output
1 3 2
Explanation
The next lexicographical permutation of [1, 2, 3] is [1, 3, 2].

Example 2
Input
3
3 2 1
Output
1 2 3
Explanation
[3, 2, 1] is the highest possible permutation, so it is rearranged to the lowest possible order [1, 2, 3].

Example 3
Input
3
1 1 5
Output
1 5 1
Explanation
The next lexicographical permutation of [1, 1, 5] is [1, 5, 1].

Constraints
1 <= N <= 10^5
0 <= arr[i] <= 100
*/

import java.io.*;
import java.util.*;

public class nextPermutation {
    static class Solution {
        public void nextPermutation(int[] arr, int n) {
            if (n <= 1) return;

            // Step 1: Find the first decreasing element from the right (pivot)
            int i = n - 2;
            while (i >= 0 && arr[i] >= arr[i + 1]) {
                i--;
            }

            // Step 2: If pivot found, find the element just larger than arr[i] from the right
            if (i >= 0) {
                int j = n - 1;
                while (arr[j] <= arr[i]) {
                    j--;
                }
                swap(arr, i, j);
            }

            // Step 3: Reverse the suffix starting from i + 1 to the end
            reverse(arr, i + 1, n - 1);
        }

        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        private void reverse(int[] arr, int start, int end) {
            while (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
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
            obj.nextPermutation(arr, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]);
                if (i < n - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
