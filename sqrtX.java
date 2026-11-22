/*
Integer Square Root

Given a non-negative integer x, return the square root of x rounded down to
the nearest integer. Do not use a built-in square root function.

Input Format
A single integer x.

Output Format
Print the integer square root of x.

Example 1
Input
4
Output
2

Example 2
Input
8
Output
2

Example 3
Input
2147483647
Output
46340

Constraints
0 <= x <= 2147483647
Time: O(log x); auxiliary space: O(1).
*/

import java.util.Scanner;

public class sqrtX {
    static int integerSqrt(int x) {
        long low = 0;
        long high = (long) x + 1; // exclusive upper bound
        while (low + 1 < high) {
            long mid = low + (high - low) / 2;
            if (mid * mid <= x) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return (int) low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            System.out.println(integerSqrt(sc.nextInt()));
        }
        sc.close();
    }
}
