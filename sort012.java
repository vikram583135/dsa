/*
Sort an Array of 0s, 1s, and 2s (Dutch National Flag Algorithm)

Given an array consisting of only 0s, 1s, and 2s, sort the array in ascending order in-place without using any built-in sorting algorithm.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers (each either 0, 1, or 2).

Output Format
Print the sorted array elements separated by a single space.

Example 1
Input
6
2 0 2 1 1 0
Output
0 0 1 1 2 2
Explanation
After sorting 0s, 1s, and 2s, the array becomes [0, 0, 1, 1, 2, 2].

Example 2
Input
5
2 0 1 2 0
Output
0 0 1 2 2
Explanation
After sorting, the array becomes [0, 0, 1, 2, 2].

Constraints
1 <= N <= 10^5
arr[i] ∈ {0, 1, 2}
*/

import java.io.*;
import java.util.*;

public class sort012 {
    static class Solution {
        public void sort012(int[] arr, int n) {
            int low = 0;
            int mid = 0;
            int high = n - 1;

            while (mid <= high) {
                if (arr[mid] == 0) {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                } else if (arr[mid] == 1) {
                    mid++;
                } else {
                    swap(arr, mid, high);
                    high--;
                }
            }
        }

        private void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
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
            obj.sort012(arr, n);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).append(i == n - 1 ? "" : " ");
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
