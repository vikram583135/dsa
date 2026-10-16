/*
Majority Element (Boyer-Moore Voting Algorithm)

Given an array of size N, find the majority element. The majority element is the element that appears more than floor(N / 2) times.
You may assume that the majority element always exists in the array.

Input Format
1st line contains an integer N denoting the size of the array.
2nd line contains N space-separated integers denoting the elements of the array.

Output Format
Print a single integer - the majority element.

Example 1
Input
3
3 2 3
Output
3
Explanation
3 appears 2 times, which is greater than floor(3 / 2) = 1.

Example 2
Input
7
2 2 1 1 1 2 2
Output
2
Explanation
2 appears 4 times, which is greater than floor(7 / 2) = 3.

Constraints
1 <= N <= 10^5
-10^9 <= arr[i] <= 10^9
*/

import java.io.*;
import java.util.*;

class Solution {
    public int majorityElement(int[] arr, int n) {
        // Boyer-Moore Voting Algorithm
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verification phase
        int actualCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) {
                actualCount++;
            }
        }

        if (actualCount > n / 2) {
            return candidate;
        }

        return -1;
    }
}

public class majorityElement {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.majorityElement(arr, n));
        }
        sc.close();
    }
}
